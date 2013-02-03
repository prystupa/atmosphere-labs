package com.prystupa;

import org.atmosphere.annotation.Broadcast;
import org.atmosphere.annotation.Suspend;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 2/3/13
 * Time: 9:35 AM
 */

@Path("/")
@Produces("application/json")
public class ResourceChat {

    @Suspend
    @GET
    public String suspend() {
        return "";
    }

    @Broadcast(writeEntity = false)
    @POST
    public Response broadcast(Message message) {
        return new Response(message.author, message.message);
    }

}
