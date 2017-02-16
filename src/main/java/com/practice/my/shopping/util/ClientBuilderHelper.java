package com.practice.my.shopping.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClientBuilderHelper {
	private static final String FORMAT_DATE = "yyyy-MM-dd";
	private Builder builder;

	public ClientBuilderHelper(Builder builder) {
		this.builder = builder;
	}

	public ClientBuilderHelper addHeader(String name, Object value) {
		this.builder = builder.header(name, value);
		return this;
	}

	private Gson createGson() {
		GsonBuilder gson = buildGson();

		return gson.create();
	}

	private <T> Gson createGson(CustomDeserializer<T> customDeserializer) {
		GsonBuilder gson = buildGson();
		gson = customDeserializer.registerTo(gson);
		return gson.create();
	}

	private GsonBuilder buildGson() {
		GsonBuilder gson = new GsonBuilder();
		gson.setDateFormat(FORMAT_DATE);
		return gson;
	}

	public Response getAsResponse() {
		return builder.get();
	}

	public String getAsJsonString() {
		return builder.get(String.class);
	}

	public <T> T getAsObject(Class<T> clazz) {
		String jsonString = getAsJsonString();
		return createGson().fromJson(jsonString, clazz);
	}

	public <T, C> T getAsObject(Class<T> type, CustomDeserializer<C> deserializer) {
		String jsonString = getAsJsonString();
		System.out.println(jsonString);
		return createGson(deserializer).fromJson(jsonString, type);
	}

	public <T> List<T> getAsListOf(Class<T[]> clazz) {
		String jsonString = getAsJsonString();
		T[] jsonToObject = createGson().fromJson(jsonString, clazz);

		return Arrays.asList(jsonToObject);
	}

	public <T, C> List<T> getAsListOf(Class<T[]> type, CustomDeserializer<C> customDeserializer) {
		String json = getAsJsonString();
		T[] jsonToObject = createGson(customDeserializer).fromJson(json, type);
		return Arrays.asList(jsonToObject);
	}

	public Response postAsResponse(Object objectPost) {
		Gson gson = createGson();
		String jsonString = gson.toJson(objectPost);

		InputStream is = new ByteArrayInputStream(jsonString.getBytes());

		Response response =  builder.post(Entity.entity(is, MediaType.APPLICATION_JSON_TYPE));
		return response;
	}

	public String postAsJsonString(Object objectPost) {
		Response response =  postAsResponse(objectPost);

		if (response.getEntity() != null) {
			return response.readEntity(String.class);
		}

		return "";
	}

	public <T> T postAsObject(Object objectPost, Class<T> clazz) {
		String json = postAsJsonString(objectPost);

		Gson gson = createGson();
		return gson.fromJson(json, clazz);
	}

	public Response deleteAsResponse() {
		Response response =  builder.delete();
		return response;
	}

	public Response putAsResponse(String jsonString) {
		InputStream is = new ByteArrayInputStream(jsonString.getBytes());

		Response response =  builder.put(Entity.entity(is, MediaType.APPLICATION_JSON_TYPE));
		return response;
	}

	public Response putAsResponse(Object objectPost) {
		Gson gson = createGson();
		String jsonString = gson.toJson(objectPost);
		return putAsResponse(jsonString);
	}

	public String putAsJsonString(Object objectPost) {
		Response response =  putAsResponse(objectPost);

		if (response.getEntity() != null) {
			return response.readEntity(String.class);
		}

		return "";
	}

	public <T> T putAsObject(Object objectPost, Class<T> clazz) {
		String json = putAsJsonString(objectPost);

		Gson gson = createGson();
		return gson.fromJson(json, clazz);
	}

}
