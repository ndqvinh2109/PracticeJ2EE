package com.practice.my.shopping.util;

import java.net.URL;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class RestClientHelper {
	private static final String APPLICATION_PATH = "api";
	private WebTarget webTarget;
	
	public static RestClientHelper newClient(URL baseURL) {
		RestClientHelper clientBuilderHelper = new RestClientHelper();
		 clientBuilderHelper.webTarget = ClientBuilder.newClient().target(baseURL.toExternalForm()).path(APPLICATION_PATH);
		
		return clientBuilderHelper;
	}
	
	public RestClientHelper path(String path) {
		this.webTarget = this.webTarget.path(path);
		return this;
	}
	
	public RestClientHelper queryParam(String name, Object... values) {
		this.webTarget = this.webTarget.queryParam(name, values);
		return this;
	}
	
	public ClientBuilderHelper request() {
		Builder builder = this.webTarget.request(MediaType.APPLICATION_JSON);
		ClientBuilderHelper clientBuilderHelper = new ClientBuilderHelper(builder);
		return clientBuilderHelper;
	}
}
