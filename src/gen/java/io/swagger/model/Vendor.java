package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Created by Lakshman on 5/8/16.
 */
@ApiModel(description = "vendor data")
public class Vendor {

    private Integer id = null;
    private String name = null;
    private String address = null;
    private String emailAddress = null;
    private String phoneNumber = null;
    private String faxNumber = null;

    public Vendor(String name) {
        this.name = name;
    }


    /**
     * vendor id
     **/

    @ApiModelProperty(value = "vendor id")
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * vendor name
     **/

    @ApiModelProperty(value = "vendor name")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * vendor address
     **/

    @ApiModelProperty(value = "vendor address")
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * vendor email address
     **/

    @ApiModelProperty(value = "vendor email address")
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * vendor phone number
     **/

    @ApiModelProperty(value = "vendor phone number")
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * vendor fax number
     **/

    @ApiModelProperty(value = "vendor fax number")
    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vendor vendor = (Vendor) o;
        return Objects.equals(id, vendor.id) &&
                Objects.equals(name, vendor.name) &&
                Objects.equals(address, vendor.address) &&
                Objects.equals(emailAddress, vendor.emailAddress) &&
                Objects.equals(phoneNumber, vendor.phoneNumber) &&
                Objects.equals(faxNumber, vendor.faxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, emailAddress, phoneNumber, faxNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class vendor {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
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
