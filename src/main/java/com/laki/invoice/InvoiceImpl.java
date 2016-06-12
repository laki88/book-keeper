package com.laki.invoice;

import com.laki.invoice.dao.InvoiceDao;
import io.swagger.model.Invoice;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lakshman on 4/23/16.
 */
public class InvoiceImpl {


    public static boolean addInvoice(Invoice invoice) {
        Map<String, Integer> items = new HashMap<String, Integer>();
        String invoiceTable = invoice.getInvoiceTable();
        JSONArray jsonInvoiceTable = new JSONArray(invoiceTable);
        for (int i = 0; i < jsonInvoiceTable.length(); i++) {
            items.put((String) ((JSONObject) jsonInvoiceTable.get(i)).get("Item Code"), Integer.parseInt((String) ((JSONObject) jsonInvoiceTable.get(i)).get("Quantity")));
        }
        return InvoiceDao.addInvoice(invoice, items);

    }

}
