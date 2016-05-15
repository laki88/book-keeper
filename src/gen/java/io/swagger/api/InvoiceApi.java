package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.InvoiceApiService;
import io.swagger.api.factories.InvoiceApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Invoice;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/invoice")


@io.swagger.annotations.Api(description = "the invoice API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public class InvoiceApi  {
   private final InvoiceApiService delegate = InvoiceApiServiceFactory.getInvoiceApi();

    @PUT
    @Path("/add")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "add an invoice", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "invoice added", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response invoiceAddPut(
        @ApiParam(value = "customer name", required=true)@FormParam("name")  String name,
        @ApiParam(value = "invoice added date", required=true)@FormParam("date")  String date,
        @ApiParam(value = "customer address", required=true)@FormParam("address")  String address,
        @ApiParam(value = "invoice data", required=true)@FormParam("invoiceTable")  String invoiceTable,
        @ApiParam(value = "invoice id")@FormParam("invoiceId")  String invoiceId,
        @ApiParam(value = "purchasing order number")@FormParam("pONumber")  String pONumber,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invoiceAddPut(name,date,address,invoiceTable,invoiceId,pONumber,securityContext);
    }
    @DELETE
    @Path("/delete/{invoice-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "delete an invoice", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "invoice deleted", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response invoiceDeleteInvoiceIdDelete(
        @ApiParam(value = "",required=true) @PathParam("invoice-id") String invoiceId,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invoiceDeleteInvoiceIdDelete(invoiceId,securityContext);
    }
    @GET
    @Path("/get/{invoice-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get invoice data by id", notes = "", response = Invoice.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "invoice response", response = Invoice.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Invoice.class) })
    public Response invoiceGetInvoiceIdGet(
        @ApiParam(value = "",required=true) @PathParam("invoice-id") String invoiceId,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invoiceGetInvoiceIdGet(invoiceId,securityContext);
    }
    @GET
    @Path("/getall")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all invoice data", notes = "return all invoice data", response = Invoice.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of invoices", response = Invoice.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Invoice.class, responseContainer = "List") })
    public Response invoiceGetallGet(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invoiceGetallGet(securityContext);
    }
    @POST
    @Path("/update/{invoice-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "update an invoice ", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "invoice updated", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response invoiceUpdateInvoiceIdPost(
        @ApiParam(value = "",required=true) @PathParam("invoice-id") String invoiceId,
        @ApiParam(value = "Request Body" ,required=true) Object payload,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invoiceUpdateInvoiceIdPost(invoiceId,payload,securityContext);
    }
}
