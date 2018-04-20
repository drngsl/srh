package com.drngsl.srh.api.service;

import java.util.List;

import com.drngsl.srh.dao.model.UserModel;

public interface UserService {

	public UserModel create(UserModel user);

	public List<UserModel> list();
}
