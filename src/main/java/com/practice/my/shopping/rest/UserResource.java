package com.practice.my.shopping.rest;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("users")
public class UserResource {
	
	@Inject
	private UserService userService;

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public User addUser(User user) {
		return userService.addUser(user);
	}
	

}
