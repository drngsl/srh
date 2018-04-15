package com.drngsl.srh.api.resources;

import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;

import com.drngsl.srh.api.service.UserService;
import com.drngsl.srh.dao.model.UserModel;

public class UsersResource extends ServerResource {

	@Autowired
	private UserService userService;

	@Get
	public Representation create() {
		UserModel user = new UserModel();
		user.setName("zs");
		return new JacksonRepresentation<UserModel>(user);
	}
}
