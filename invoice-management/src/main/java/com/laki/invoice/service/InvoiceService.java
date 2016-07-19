package com.laki.invoice.service;

import com.laki.invoice.bean.InvoiceBean;
import com.laki.invoice.dao.InvoiceDao;

/**
 * Created by Lakshman on 7/19/16.
 */
public abstract class InvoiceService {
    public boolean persistItem(String inventoryCode, String description, String itemName, int priceOfItem, int amount) {
        return false;
    }

    public boolean updateItem(InvoiceBean inventoryItem) {
        return InvoiceDao.getInstance().updateItem();
    }


    public boolean deleteItem(String inventoryCode) {
        return InvoiceDao.getInstance().deleteItem(inventoryCode);
    }


    public InvoiceBean getItem(String inventoryCode) {
        return InvoiceDao.getInstance().getItem(inventoryCode);
    }

}
