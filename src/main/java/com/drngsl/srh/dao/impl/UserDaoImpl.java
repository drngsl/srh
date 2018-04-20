package com.drngsl.srh.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.drngsl.srh.dao.UserDao;
import com.drngsl.srh.dao.model.UserModel;

@Repository
public class UserDaoImpl extends BaseDao<UserModel> implements UserDao {

	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(UserDao.class);

	@Transactional
	public List<UserModel> list() {
		List<UserModel> recs = super.list(UserModel.class);
		return recs;
	}
}
