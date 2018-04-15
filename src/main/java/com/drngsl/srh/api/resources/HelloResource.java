package com.drngsl.srh.api.resources;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.drngsl.srh.api.resources.model.request.HelloReq;
import com.drngsl.srh.api.resources.model.response.GetHelloResp;

public class HelloResource extends ServerResource {

	@Get
	public GetHelloResp hello(HelloReq req) {
		GetHelloResp helloResp = new GetHelloResp();
		helloResp.setHello("world");
		return helloResp;
	}
}
