/*
 * Copyright(c)2016 by AXON IVY AG, CH-6000 Lucerne. http://www.axonivy.com
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of 
 * AXON IVY AG. You shall not disclose such confidential information and 
 * shall use it only in accordance with the terms of the license 
 * agreement you entered into with AXON IVY AG.
 */
package com.practice.my.shopping.rest;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.message.AbstractHttpMessage;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class HttpHelper {

    public static void addAcceptJsonHeader(AbstractHttpMessage msg) {
        msg.addHeader("accept", "application/json");
    }

    public static JsonElement parseJsonToRootElement(HttpResponse response) throws JsonSyntaxException, IOException, UnsupportedOperationException, JsonIOException {
        JsonElement rootElement = new JsonParser().parse(new InputStreamReader(response.getEntity().getContent()));
        return rootElement;
    }

}
