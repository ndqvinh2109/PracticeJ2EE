package com.practice.my.shopping.util;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;

public interface CustomDeserializer <T> extends JsonDeserializer<T> {
	public Class<T> type();

	public default GsonBuilder registerTo(GsonBuilder builder) {
		return builder.registerTypeAdapter(type(), this);
	}
}
