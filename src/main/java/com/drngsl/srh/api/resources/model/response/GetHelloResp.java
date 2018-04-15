package com.drngsl.srh.api.resources.model.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class GetHelloResp {
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
}
