package com.drngsl.srh.api.resources.model.response;

import java.io.Serializable;

import com.drngsl.srh.dao.model.UserModel;

public class CreateUserResp implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

	public CreateUserResp(UserModel user) {
		this.id = user.getId();
		this.name = user.getName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CreateUserResp [id=" + id + ", name=" + name + "]";
	}
}
