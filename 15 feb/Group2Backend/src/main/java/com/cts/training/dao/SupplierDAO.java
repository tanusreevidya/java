package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Supplier;

public interface SupplierDAO {

	public boolean saveOrUpdateSupply(Supplier supplier);

	public boolean deleteSupply(Supplier supplier);

	public Supplier getSupplyById(int id);

	public List<Supplier> getAllSuppliers();
	

}
