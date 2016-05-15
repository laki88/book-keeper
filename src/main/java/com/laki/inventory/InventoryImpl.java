package com.laki.inventory;

import com.laki.inventory.dao.InventoryDao;
import com.laki.invoice.dao.InvoiceDao;
import io.swagger.model.Inventory;
import io.swagger.model.Invoice;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lakshman on 5/8/16.
 */
public class InventoryImpl {

    public static boolean addInventory(Inventory inventory) {
        return InventoryDao.addInventory(inventory);

    }
}
