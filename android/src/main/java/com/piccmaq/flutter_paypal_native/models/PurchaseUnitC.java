package com.piccmaq.flutter_paypal_native.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PurchaseUnitC {

    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("referenceId")
    @Expose
    private String referenceId;

    @SerializedName("invoiceId")
    @Expose
    private String invoiceId;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("softDescriptor")
    @Expose
    private String softDescriptor;


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReferenceID() {
        return referenceId;
    }

    public void setReferenceID(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
