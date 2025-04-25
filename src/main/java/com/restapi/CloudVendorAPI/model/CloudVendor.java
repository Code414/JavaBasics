package com.restapi.CloudVendorAPI.model;

public class CloudVendor {

    private String vendorId;
    private String vendorName;
    private String vendorPhoneNumber;

    //Default Constructor
    public CloudVendor() {
    }

    //Parameterized Constructor
    public CloudVendor(String vendorId, String vendorName, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    //Getter and Setters
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }


}
