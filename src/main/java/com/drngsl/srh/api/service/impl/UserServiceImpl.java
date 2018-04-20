package com.drngsl.srh.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drngsl.srh.api.service.UserService;
import com.drngsl.srh.dao.UserDao;
import com.drngsl.srh.dao.model.UserModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserModel create(UserModel user) {
		return this.userDao.save(user);
	}

	@Override
	public List<UserModel> list() {
		return this.userDao.list();
	}
}
