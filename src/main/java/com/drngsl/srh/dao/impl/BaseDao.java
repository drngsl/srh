package com.drngsl.srh.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BaseDao<T> {

	@Autowired
	protected SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	protected String createQuerySql(Class<?> clazz) {
		return "FROM " + clazz.getName();
	}

	@Transactional
	public T save(T rec) {
		this.getSession().save(rec);
		return rec;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public T get(Class<?> clazz, Serializable id) {
		Object obj = this.getSession().get(clazz, id);
		if (obj != null) {
			return (T) obj;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<T> list(Class<?> clazz) {
		List<T> recs = this.getSession()
				.createQuery(this.createQuerySql(clazz)).list();
		return recs;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void remove(Class<?> clazz, int id) {
		Session session = getSession();
		T t = (T) this.getSession().load(clazz, id);
		session.delete(t);
	}
}
