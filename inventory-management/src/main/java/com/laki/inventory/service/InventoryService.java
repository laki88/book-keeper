package com.laki.inventory.service;

import com.laki.inventory.bean.InventoryItem;
import com.laki.inventory.dao.InventoryDao;

/**
 * Created by Lakshman on 6/11/16.
 */
public abstract class InventoryService {

    public boolean persistItem(String inventoryCode, String description, String itemName, int priceOfItem, int amount) {
        return false;
    }

    public boolean updateItem(InventoryItem inventoryItem) {
        return InventoryDao.getInstance().updateItem(inventoryItem);
    }


    public boolean deleteItem(String inventoryCode) {
        return InventoryDao.getInstance().deleteItem(inventoryCode);
    }


    public InventoryItem getItem(String inventoryCode) {
        return InventoryDao.getInstance().getItem(inventoryCode);
    }
}
