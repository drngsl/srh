package com.drngsl.srh.api.resources.model.response;

import java.io.Serializable;
import java.util.List;

import com.drngsl.srh.dao.model.UserModel;

public class ListUserResp implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<UserModel> users;

	public ListUserResp(List<UserModel> users) {
		super();
		this.users = users;
	}

	public List<UserModel> getUsers() {
		return users;
	}

	public void setUsers(List<UserModel> users) {
		this.users = users;
	}
}
