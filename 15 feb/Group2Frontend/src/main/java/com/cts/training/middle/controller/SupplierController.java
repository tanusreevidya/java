package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.dao.SupplierDAO;
import com.cts.training.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDAO supplierDAO;

//	@RequestMapping("/")
//	public String defaultPage(Model model) {
//		model.addAttribute("msg", "Welcome");
//		return "index";
//	}

	@GetMapping("/supply-home")
	public String supplierPage(Model model) {
		List<Supplier> supply = supplierDAO.getAllSuppliers();
		model.addAttribute("list", supply);
		model.addAttribute("supply", new Supplier());
		return "ManageSupplies";
	}

	@PostMapping("/supply/save")
	public String saveCompany(@ModelAttribute("supply") Supplier supply) {
		supplierDAO.saveOrUpdateSupply(supply);
		return "redirect:/supply-home";
	}

	@GetMapping("/removesupply/{id}") // {}->path variable
	public String deleteCompany(@PathVariable("id") int id) {
		Supplier supply = supplierDAO.getSupplyById(id);
		supplierDAO.deleteSupply(supply);
		return "redirect:/supply-home";
	}

	@GetMapping("/updatesupply/{id}")
	public String updateCompany(@PathVariable("id") int id, Model model) {

		Supplier supply = supplierDAO.getSupplyById(id);
		model.addAttribute("supply", supply);
		List<Supplier> supplies = supplierDAO.getAllSuppliers();
		model.addAttribute("list", supplies);
		return "ManageSupplies";
	}

}
