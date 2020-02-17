package com.cts.training.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.dao.SupplierDAO;
import com.cts.training.model.Supplier;
import com.sun.xml.bind.annotation.OverrideAnnotationOf;

@Transactional
@Repository(value = "supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateSupply(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteSupply(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Supplier getSupplyById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Supplier.class, id);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		try {

			List<Supplier> supplies = sessionFactory.getCurrentSession().createQuery("from Supplier").list();

			return supplies;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
