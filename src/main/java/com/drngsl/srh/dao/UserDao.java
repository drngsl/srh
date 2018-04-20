package com.drngsl.srh.dao;

import java.util.List;

import com.drngsl.srh.dao.model.UserModel;

public interface UserDao {

	public UserModel save(UserModel user);

	public List<UserModel> list();
}
