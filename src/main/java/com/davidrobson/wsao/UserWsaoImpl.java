package com.davidrobson.wsao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserWsaoImpl implements UserWsao {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public String getUser() {
        return "{\"hello\":\"world\"}";
    }

}
