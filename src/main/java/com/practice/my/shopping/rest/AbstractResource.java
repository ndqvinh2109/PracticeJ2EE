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

import javax.ws.rs.core.Response;

public class AbstractResource {

    protected Response responseWithEntityOr404(Object obj) {
        Response response;
        if (obj == null) {
            response = Response.status(Response.Status.NOT_FOUND).build();
        } else {
            response = Response.status(Response.Status.OK).entity(obj).build();
        }
        return response;
    }

}

