package com.drngsl.srh.api.resources.model.request;

import java.io.Serializable;

public class CreateUserReq implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
