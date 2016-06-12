package io.swagger.api.factories;

import io.swagger.api.InventoryApiService;
import io.swagger.api.impl.InventoryApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public class InventoryApiServiceFactory {

    private final static InventoryApiService service = new InventoryApiServiceImpl();

    public static InventoryApiService getInventoryApi() {
        return service;
    }
}
