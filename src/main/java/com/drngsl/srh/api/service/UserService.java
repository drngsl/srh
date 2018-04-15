package com.drngsl.srh.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drngsl.srh.dao.UserDao;
import com.drngsl.srh.dao.model.UserModel;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public UserModel create(UserModel user) {
		return userDao.save(user);
	}
}
