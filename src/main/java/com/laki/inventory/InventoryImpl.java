package com.laki.inventory;

import com.laki.inventory.dao.InventoryDao;
import io.swagger.model.Inventory;

/**
 * Created by Lakshman on 5/8/16.
 */
public class InventoryImpl {

    public static boolean addInventory(Inventory inventory) {
        return InventoryDao.addInventory(inventory);

    }
}
