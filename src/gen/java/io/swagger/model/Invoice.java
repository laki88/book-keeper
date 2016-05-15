package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Customer;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-10T16:42:02.923Z")
public class Invoice   {
  
  private String invoiceId = null;
  private String invoiceTable = null;
  private Customer customer = null;
  private String date = null;

  
  /**
   * invoice identifier
   **/
  public Invoice invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  
  @ApiModelProperty(value = "invoice identifier")
  @JsonProperty("invoice-id")
  public String getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  
  /**
   * data table related to invoice in json format
   **/
  public Invoice invoiceTable(String invoiceTable) {
    this.invoiceTable = invoiceTable;
    return this;
  }

  
  @ApiModelProperty(value = "data table related to invoice in json format")
  @JsonProperty("invoice-table")
  public String getInvoiceTable() {
    return invoiceTable;
  }
  public void setInvoiceTable(String invoiceTable) {
    this.invoiceTable = invoiceTable;
  }

  
  /**
   **/
  public Invoice customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customer")
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  /**
   * invoice created date
   **/
  public Invoice date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "invoice created date")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
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
    Invoice invoice = (Invoice) o;
    return Objects.equals(invoiceId, invoice.invoiceId) &&
        Objects.equals(invoiceTable, invoice.invoiceTable) &&
        Objects.equals(customer, invoice.customer) &&
        Objects.equals(date, invoice.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, invoiceTable, customer, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceTable: ").append(toIndentedString(invoiceTable)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

