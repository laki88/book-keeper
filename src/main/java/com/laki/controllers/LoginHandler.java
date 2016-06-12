package com.laki.controllers;

import com.google.gson.Gson;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/login")
public class LoginHandler {

    @Context
    private HttpServletRequest request;
    @Context
    private HttpServletResponse response;

    @POST
    @Path("/login")
    public Response authenticate(@FormParam("username") String userName, @FormParam("password") String password, @Context SecurityContext securityContext)
            throws JSONException {

        //String jsonResponse;
        Gson gson = new Gson();
        JSONObject obj = new JSONObject();


        if ("admin".equals(userName) && "admin".equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("authenticated", true);
            session.setAttribute("user", "admin");
            obj.put("authenticated", true);
            obj.put("user", "admin");
            //jsonResponse.put("authenticated", true);
            return Response.status(200).entity(obj.toString()).build();
        }
        //jsonResponse.put("authenticated", false);
        obj.put("authenticated", false);

        return Response.status(200).entity(obj.toString()).build();
    }
}
