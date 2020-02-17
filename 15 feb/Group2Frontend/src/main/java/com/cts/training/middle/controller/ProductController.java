package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.ProductDAO;
import com.cts.training.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDAO productDAO;

	@GetMapping("/product-home")
	public String productPage(Model model) {
		List<Product> products = productDAO.getAllProducts();
		model.addAttribute("list", products);

		model.addAttribute("product", new Product());
		return "ManageProducts";
	}

	@PostMapping("/product/save")
	// @RequestMapping(value="/product/save", method= RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product) {// gets data from the form
		productDAO.saveOrUpdateProduct(product);

		return "redirect:/product-home";
	}

	@GetMapping("/remove-product/{id}") // {}-->path Variable
	public String deleteProduct(@PathVariable("id") int id) {// to get path variable dynamic or we can use @RequestParam
		Product product = productDAO.getProductById(id);
		productDAO.deleteProduct(product);
		return "redirect:/product-home";

	}

	@GetMapping("/update-product/{id}")
	public String updateProduct(@PathVariable("id") int id, Model model) {
		Product product = productDAO.getProductById(id);
		model.addAttribute("product", product);
		List<Product> products = productDAO.getAllProducts();
		model.addAttribute("list", products);
		return "ManageProducts";
	}

}
