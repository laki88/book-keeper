package com.laki.inventory.factories;

import com.laki.inventory.InventoryServiceImpl;
import com.laki.inventory.service.InventoryService;

/**
 * Created by Lakshman on 6/11/16.
 */
public class InventoryAPIServiceFactory {

    private static final InventoryService service = new InventoryServiceImpl();

    public InventoryService getInventoryService() {
        return service;
    }
}
