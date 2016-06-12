package io.swagger.model;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-27T14:28:47.690Z")
public class Inventory {

    private Integer inventoryId = null;
    private String itemCode = null;
    private String description = null;
    private Long itemPrice = null;
    private Vendor vendor = null;
    private Long quantity = null;
    private Date date = null;


    /**
     * inventory id
     **/

    @ApiModelProperty(value = "inventory id")
    @JsonProperty("inventory-id")
    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }


    /**
     * inventory code
     **/

    @ApiModelProperty(value = "item code")
    @JsonProperty("item-code")
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * name of the item
     **/

    @ApiModelProperty(value = "description about the item")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("item-price")
    public Long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }


    @ApiModelProperty(value = "")
    @JsonProperty("vendor")
    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }


    @ApiModelProperty(value = "")
    @JsonProperty("quantity")
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @ApiModelProperty(value = "")
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    public void setQuantity(Date date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Inventory inventory = (Inventory) o;
        return Objects.equals(itemCode, inventory.itemCode) &&
                Objects.equals(description, inventory.description) &&
                Objects.equals(itemPrice, inventory.itemPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemCode, description, itemPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Inventory {\n");

        sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(description)).append("\n");
        sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

