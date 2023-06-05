package com.example.modelclassapi.models;

import com.google.gson.annotations.SerializedName;

public class Shop {
    @SerializedName("id")
    private Integer id;

    @SerializedName("admin_graphql_api_id")
    private String adminGraphql;

    @SerializedName("app_id")
    private Integer appId;
    @SerializedName("browser_ip")
    private String browserIp;

    @SerializedName("buyer_accepts_marketing")
    private Boolean buyerAccepts;

    @SerializedName("cancel_reason")
    private String cancelReason;

    @SerializedName("cancelled_at")
    private String cancelledAt;

    @SerializedName("cart_token")
    private String cartToken;

    @SerializedName("checkout_id")
    private String checkoutId;

    @SerializedName("checkout_token")
    private String checkoutToken;

    @SerializedName("client_details")
    private ClientDetails clientDetails;

    @SerializedName("closed_at")
    private String closedAt;

    @SerializedName("confirmed")
    private Boolean confirmed;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("currency")
    private String currency;

    @SerializedName("current_subtotal_price")
    private String currentSubtotalPrice;
    @SerializedName("current_subtotal_price_set")
    private Money money;

    @SerializedName("current_total_discounts")
    private String currentTotalDiscounts;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminGraphql() {
        return adminGraphql;
    }

    public void setAdminGraphql(String adminGraphql) {
        this.adminGraphql = adminGraphql;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public Boolean getBuyerAccepts() {
        return buyerAccepts;
    }

    public void setBuyerAccepts(Boolean buyerAccepts) {
        this.buyerAccepts = buyerAccepts;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCartToken() {
        return cartToken;
    }

    public void setCartToken(String cartToken) {
        this.cartToken = cartToken;
    }

    public String getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(String checkoutId) {
        this.checkoutId = checkoutId;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }

    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public ClientDetails getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrentSubtotalPrice() {
        return currentSubtotalPrice;
    }

    public void setCurrentSubtotalPrice(String currentSubtotalPrice) {
        this.currentSubtotalPrice = currentSubtotalPrice;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public String getCurrentTotalDiscounts() {
        return currentTotalDiscounts;
    }

    public void setCurrentTotalDiscounts(String currentTotalDiscounts) {
        this.currentTotalDiscounts = currentTotalDiscounts;
    }
}
