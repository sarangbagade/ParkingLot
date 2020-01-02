package com.ParkingLot.Models.electronics;

import com.ParkingLot.DBObject;

public abstract class Electronics extends DBObject {

    private String invoice;
    private String modelNumber;
    private String serialNUmber;

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNUmber() {
        return serialNUmber;
    }

    public void setSerialNUmber(String serialNUmber) {
        this.serialNUmber = serialNUmber;
    }
}
