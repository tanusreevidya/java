package com.cts.training.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.model.Category;
import com.cts.training.dao.CategoryDAO;

@Transactional
@Repository(value = "CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Category getCategoryById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Category.class, id);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Category> getAllCategories() {
		try {
			List<Category> categories = sessionFactory.getCurrentSession().createQuery("FROM Category").list();
			return categories;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
