package com.example.modelclassapi.models;

import com.google.gson.annotations.SerializedName;

public class ShopMoney {
    @SerializedName("amount")
    private String amount;

    @SerializedName("currency_code")
    private String currencyCode;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
