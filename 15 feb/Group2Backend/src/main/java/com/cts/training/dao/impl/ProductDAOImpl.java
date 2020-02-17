package com.cts.training.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.dao.ProductDAO;
import com.cts.training.model.Product;

@Transactional
@Repository(value = "productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Product getProductById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Product.class, id);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> getAllProducts() {
		try {

			List<Product> product = sessionFactory.getCurrentSession().createQuery("from Product").list();
			return product;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
