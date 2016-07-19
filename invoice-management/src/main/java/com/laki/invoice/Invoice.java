package com.laki.invoice;


import com.laki.invoice.bean.InvoiceBean;
import com.laki.invoice.service.InvoiceService;
import org.apache.log4j.Logger;

import javax.ws.rs.*;

@Path("/invoice")
public class Invoice {
    private final InvoiceService delegate = new InvoiceServiceImpl();
    private final static Logger logger = Logger.getLogger(Invoice.class);

    @PUT
    @Path("/add")
    @Consumes({"application/x-www-form-urlencoded"})
    @Produces({"application/json"})
    public boolean persistItem(@FormParam("invoice-code") String inventoryCode, @FormParam("description") String description, @FormParam("item-name") String itemName, @FormParam("unit-price") int priceOfItem, @FormParam("amount") int amount){
        logger.info("invoice item received for save");
        return delegate.persistItem(inventoryCode, description, itemName, priceOfItem, amount);
    }

    public boolean updateItem(InvoiceBean inventoryItem){
        return false;
    }

    public boolean deleteItem(String inventoryCode){
        return false;
    }

    @GET
    @Path("/get/{invoice-code}")
    public InvoiceBean getItem(@PathParam("invoice-code") String inventoryCode){
        return null;
    }


}
