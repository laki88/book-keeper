package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Inventory;

import java.util.List;

import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public abstract class InventoryApiService {

    public abstract Response inventoryAddPut(String name, String date, String address, String inventoryTable, String inventoryId, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response inventoryDeleteInventoryIdDelete(String inventoryId, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response inventoryGetInventoryIdGet(String inventoryId, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response inventoryGetallGet(SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response inventoryUpdateInventoryIdPost(String inventoryId, Object payload, SecurityContext securityContext)
            throws NotFoundException;

}
