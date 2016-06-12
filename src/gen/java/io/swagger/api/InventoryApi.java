package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.InventoryApiService;
import io.swagger.api.factories.InventoryApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Inventory;

import java.util.List;

import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/inventory")


@io.swagger.annotations.Api(description = "the inventory API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public class InventoryApi {
    private final InventoryApiService delegate = InventoryApiServiceFactory.getInventoryApi();

    @PUT
    @Path("/add")
    @Consumes({"application/x-www-form-urlencoded"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "add an inventory item", notes = "", response = void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "inventory item added", response = void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class)})
    public Response inventoryAddPut(
            @ApiParam(value = "vendor name", required = true) @FormParam("name") String name,
            @ApiParam(value = "inventory entry added date", required = true) @FormParam("date") String date,
            @ApiParam(value = "vendor address", required = true) @FormParam("address") String address,
            @ApiParam(value = "inventory data", required = true) @FormParam("inventoryTable") String inventoryTable,
            @ApiParam(value = "inventory id") @FormParam("inventoryId") String inventoryId,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.inventoryAddPut(name, date, address, inventoryTable, inventoryId, securityContext);
    }

    @DELETE
    @Path("/delete/{inventory-id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "delete an inventory item", notes = "", response = void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "inventory item deleted", response = void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class)})
    public Response inventoryDeleteInventoryIdDelete(
            @ApiParam(value = "", required = true) @PathParam("inventory-id") String inventoryId,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.inventoryDeleteInventoryIdDelete(inventoryId, securityContext);
    }

    @GET
    @Path("/get/{inventory-id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "get inventory data by id", notes = "", response = Inventory.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "inventory item response", response = Inventory.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Inventory.class)})
    public Response inventoryGetInventoryIdGet(
            @ApiParam(value = "", required = true) @PathParam("inventory-id") String inventoryId,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.inventoryGetInventoryIdGet(inventoryId, securityContext);
    }

    @GET
    @Path("/getall")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "get all inventory data", notes = "return all inventory items", response = Inventory.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "An array of inventory items", response = Inventory.class, responseContainer = "List"),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Inventory.class, responseContainer = "List")})
    public Response inventoryGetallGet(
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.inventoryGetallGet(securityContext);
    }

    @POST
    @Path("/update/{inventory-id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "update an inventory item", notes = "", response = void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "inventory updated", response = void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class)})
    public Response inventoryUpdateInventoryIdPost(
            @ApiParam(value = "", required = true) @PathParam("inventory-id") String inventoryId,
            @ApiParam(value = "Request Body") Object payload,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.inventoryUpdateInventoryIdPost(inventoryId, payload, securityContext);
    }
}
