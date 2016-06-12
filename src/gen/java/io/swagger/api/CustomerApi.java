package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CustomerApiService;
import io.swagger.api.factories.CustomerApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Customer;

import java.util.List;

import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/customer")


@io.swagger.annotations.Api(description = "the customer API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public class CustomerApi {
    private final CustomerApiService delegate = CustomerApiServiceFactory.getCustomerApi();

    @PUT
    @Path("/add")
    @Consumes({"application/x-www-form-urlencoded"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "add a customer", notes = "", response = void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "customer added", response = void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class)})
    public Response customerAddPut(
            @ApiParam(value = "customer name", required = true) @FormParam("name") String name,
            @ApiParam(value = "customer address") @FormParam("address") String address,
            @ApiParam(value = "customer email") @FormParam("emailAddress") String emailAddress,
            @ApiParam(value = "customer phone number") @FormParam("phoneNumber") String phoneNumber,
            @ApiParam(value = "customer fax number") @FormParam("faxNumber") String faxNumber,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.customerAddPut(name, address, emailAddress, phoneNumber, faxNumber, securityContext);
    }

    @DELETE
    @Path("/delete/{customer-id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "delete a customer", notes = "", response = void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "customer deleted", response = void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class)})
    public Response customerDeleteCustomerIdDelete(
            @ApiParam(value = "", required = true) @PathParam("customer-id") String customerId,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.customerDeleteCustomerIdDelete(customerId, securityContext);
    }

    @GET
    @Path("/get/{customer-id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "get customer data by id", notes = "", response = Customer.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "customer response", response = Customer.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Customer.class)})
    public Response customerGetCustomerIdGet(
            @ApiParam(value = "", required = true) @PathParam("customer-id") String customerId,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.customerGetCustomerIdGet(customerId, securityContext);
    }

    @GET
    @Path("/getall")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "get all customers", notes = "", response = Customer.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "An array of customer", response = Customer.class, responseContainer = "List"),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Customer.class, responseContainer = "List")})
    public Response customerGetallGet(
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.customerGetallGet(securityContext);
    }

    @POST
    @Path("/update/{customer-id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "update a customer", notes = "", response = void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "customer updated", response = void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class)})
    public Response customerUpdateCustomerIdPost(
            @ApiParam(value = "", required = true) @PathParam("customer-id") String customerId,
            @ApiParam(value = "Request Body") Object payload,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.customerUpdateCustomerIdPost(customerId, payload, securityContext);
    }
}
