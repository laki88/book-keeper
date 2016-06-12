package io.swagger.api.factories;

import io.swagger.api.InvoiceApiService;
import io.swagger.api.impl.InvoiceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public class InvoiceApiServiceFactory {

    private final static InvoiceApiService service = new InvoiceApiServiceImpl();

    public static InvoiceApiService getInvoiceApi() {
        return service;
    }
}
