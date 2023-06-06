package com.example.modelclassapi.models;

import com.google.gson.annotations.SerializedName;

public class TextLines {
    @SerializedName("channel_liable")
    private Boolean channelLiable;
    private String price;
    @SerializedName("price_set")
    private Money priceSet;
    private Float rate;
    private String title;
}
