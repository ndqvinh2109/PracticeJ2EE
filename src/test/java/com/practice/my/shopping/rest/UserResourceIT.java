package com.practice.my.shopping.rest;

import java.net.URL;

import org.hamcrest.Matchers;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.practice.my.shopping.entity.User;
import com.practice.my.shopping.service.UserTestUtil;
import com.practice.my.shopping.util.RestClientHelper;

@RunWith(Arquillian.class)
public class UserResourceIT {


	private static final String USERS = "users";

	@Deployment
	public static WebArchive createDeployment() {
		return DeploymentFactory.createFullDeployment();
	}
	
	@Test
	@RunAsClient
	public void should_Save_User_Successfully(@ArquillianResource URL baseURL) {
		User user = RestClientHelper.newClient(baseURL)
				.path(USERS)
				.request()
				.postAsObject(UserTestUtil.prepareUserForTesting(), User.class);
		
		Assert.assertThat(user.getId(), Matchers.greaterThan(0l));
	}
	
}
