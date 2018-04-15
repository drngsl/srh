package com.drngsl.srh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.drngsl.srh.dao.model.UserModel;

@Repository
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public UserModel save(UserModel u) {
		this.getCurrentSession().save(u);
		return u;
	}

	public UserModel getById(int id) {
		return (UserModel) this.getCurrentSession()
				.createCriteria(UserModel.class).add(Restrictions.eq("id", id))
				.uniqueResult();
	}
}
