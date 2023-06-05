package com.example.modelclassapi.models;

import com.google.gson.annotations.SerializedName;

public class Money {

    @SerializedName("shop_money")
    private ShopMoney shopMoney;

    @SerializedName("presentment_money")
    private PresentmentMoney presentmentMoney;

}
