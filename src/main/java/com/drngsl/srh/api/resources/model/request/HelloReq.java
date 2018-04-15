package com.drngsl.srh.api.resources.model.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class HelloReq {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
