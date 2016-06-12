package com.laki.inventory.bean;


public class InventoryItem {

    String inventoryCode;
    String description;
    String itemName;
    int priceOfItem;
    int amount;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(int priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

}
