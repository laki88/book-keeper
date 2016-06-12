package com.laki.inventory;


import com.laki.inventory.bean.InventoryItem;
import com.laki.inventory.service.InventoryService;

import javax.ws.rs.*;

@Path("/inventory")
public class Inventory {

    private final InventoryService delegate = new InventoryServiceImpl();

    @PUT
    @Path("/add")
    @Consumes({"application/x-www-form-urlencoded"})
    @Produces({"application/json"})
    public boolean persistItem(@FormParam("inventory-code") String inventoryCode, @FormParam("description") String description, @FormParam("item-name") String itemName, @FormParam("unit-price") int priceOfItem, @FormParam("amount") String amount){
        return delegate.persistItem(inventoryCode,description, itemName, priceOfItem, amount);
    }

    public boolean updateItem(InventoryItem inventoryItem){
        return false;
    }

    public boolean deleteItem(String inventoryCode){
        return false;
    }

    @GET
    @Path("/get/{inventory-code}")
    public InventoryItem getItem(@PathParam("inventory-code") String inventoryCode){
        return null;
    }

}
