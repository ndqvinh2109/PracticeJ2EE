package com.practice.my.shopping.service;

import javax.inject.Inject;

import org.hamcrest.Matchers;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.practice.my.shopping.entity.User;
import com.practice.my.shopping.rest.DeploymentFactory;

@RunWith(Arquillian.class)
public class UserServiceIT {
	
	@Inject
	private UserService userService;

	@Deployment
	public static WebArchive createDeployment() {
		return DeploymentFactory.createFullDeployment();
	}
	
	@Test
	public void should_Save_User_Successfully() {
		User user = UserTestUtil.prepareUserForTesting();
		userService.addUser(user);
		Assert.assertThat(user.getId(), Matchers.greaterThan(0l));
	}
	
	
}
