package com.laki.inventory;


import com.laki.inventory.bean.InventoryItem;
import com.laki.inventory.dao.InventoryDao;
import com.laki.inventory.service.InventoryService;

public class InventoryServiceImpl extends InventoryService {


    public boolean persistItem(String inventoryCode, String description, String itemName, int priceOfItem, int amount) {
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setInventoryCode(inventoryCode);
        inventoryItem.setDescription(description);
        inventoryItem.setItemName(itemName);
        inventoryItem.setPriceOfItem(priceOfItem);
        inventoryItem.setAmount(amount);
        return InventoryDao.getInstance().saveItem(inventoryItem);
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
