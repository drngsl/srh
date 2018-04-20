package com.drngsl.srh.api.resources;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;

import com.drngsl.srh.api.resources.model.request.CreateUserReq;
import com.drngsl.srh.api.resources.model.response.CreateUserResp;
import com.drngsl.srh.api.resources.model.response.ListUserResp;
import com.drngsl.srh.api.service.UserService;
import com.drngsl.srh.dao.model.UserModel;

public class UsersResource extends ServerResource {
	@Autowired
	private UserService userService;

	@Get("json")
	public ListUserResp list() {
		return new ListUserResp(userService.list());
	}

	@Post("json")
	public CreateUserResp create(CreateUserReq createUserReq) {
		UserModel user = new UserModel();
		user.setName(createUserReq.getName());
		CreateUserResp userResp = new CreateUserResp(userService.create(user));
		return userResp;
	}
}
