package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Invoice;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public abstract class InvoiceApiService {
  
      public abstract Response invoiceAddPut(String name,String date,String address,String invoiceTable,String invoiceId,String pONumber,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response invoiceDeleteInvoiceIdDelete(String invoiceId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response invoiceGetInvoiceIdGet(String invoiceId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response invoiceGetallGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response invoiceUpdateInvoiceIdPost(String invoiceId,Object payload,SecurityContext securityContext)
      throws NotFoundException;
  
}
