package com.cts.training.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.dao.UserDAO;
import com.cts.training.model.User;

@Transactional
@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateUser(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
	}

	@Override
	public boolean removeUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(User.class, id);
		} catch (HibernateException e) {
			System.out.println("Exception: " + e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		try {
			List<User> users = sessionFactory.getCurrentSession().createQuery("FROM User").list();
			return users;
		} catch (HibernateException e) {
			System.out.println("Exception: " + e.getMessage());
			return null;
		}
	}
}