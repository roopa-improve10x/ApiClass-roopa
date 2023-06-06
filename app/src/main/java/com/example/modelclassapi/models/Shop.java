package com.example.modelclassapi.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Shop {
    @SerializedName("_id")
    private String serverId;
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
    private Money currentSubtotalPriceSet;

    @SerializedName("current_total_discounts")
    private String currentTotalDiscounts;

    @SerializedName("current_total_discounts_set")
    private Money currentTotalDiscountsSet;

    @SerializedName("current_total_duties_set")
    private String currentTotalDutiesSet;
    @SerializedName("current_total_price")
    private String currentTotalPrice;
    @SerializedName("current_total_price_set")
    private Money currentTotalPriceSet;
    @SerializedName("current_total_tax")
    private String currentTotalTax;

    @SerializedName("current_total_tax_set")
    public Money currentTotalTaxSet;

    @SerializedName("customer_locale")
    private String customerLocale;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("discount_codes")
    private ArrayList<String> discountCodes;

    @SerializedName("estimated_taxes")
    private boolean estimatedTaxes;

    @SerializedName("financial_status")
    private String financialStatus;

    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;

    @SerializedName("gateway")
    private String gateway;

    @SerializedName("landing_site")
    private String landingSite;

    @SerializedName( "landing_site_ref")
    private String landingSiteRef;

    @SerializedName("location_id")
    private String locationId;

    @SerializedName("name")
    private String name;

    @SerializedName("note")
    private String note;

    @SerializedName("note_attributes")
    private ArrayList<String> noteAttributes;

    @SerializedName("number")
    private Integer number;

    @SerializedName("order_number")
    private Integer orderNumber;

    @SerializedName("order_status_url")
    private String orderStatusUrl;

    @SerializedName("original_total_duties_set")
    private String originalTotalDutiesSet;

    @SerializedName("payment_gateway_names")
    private ArrayList<String> paymentGatewayNames;

    @SerializedName("presentment_currency")
    private String presentmentCurrency;

    @SerializedName("processed_at")
    private String processedAt;

    @SerializedName("processing_method")
    private String processingMethod;

    @SerializedName("reference")
    private String reference;

    @SerializedName("referring_site")
    private String referringSite;

    @SerializedName( "source_identifier")
    private String sourceIdentifier;

    @SerializedName("source_name")
    private String sourceName;

    @SerializedName("source_url")
    private String sourceUrl;

    @SerializedName("subtotal_price")
    private String subtotalPrice;

    @SerializedName("subtotal_price_set")
    public Money subtotalPriceSet;

    @SerializedName("tags")
    private String tags;

    @SerializedName("taxes_included")
    private boolean taxesIncluded;

    @SerializedName("test")
    private boolean test;

    @SerializedName("token")
    private String token;

    @SerializedName("total_discounts")
    private String totalDiscounts;

    @SerializedName("total_discounts_set")
    public Money totalDiscountsSet;

    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;

    @SerializedName("total_line_items_price_set")
    public Money totalLineItemsPriceSet;

    @SerializedName("total_outstanding")
    private String totalOutstanding;

    @SerializedName("total_price")
    private String totalPrice;

    @SerializedName("total_price_set")
    public Money totalPriceSet;

    @SerializedName("total_price_usd")
    private String totalPriceUsd;

    @SerializedName("total_shipping_price_set")
    public Money totalShippingPriceSet;

    @SerializedName("total_tax")
    private String totalTax;

    @SerializedName("total_tax_set")
    public Money totalTaxSet;

    @SerializedName("total_tip_received")
    private String totalTipReceived;

    @SerializedName("total_weight")
    private Integer totalWeight;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("discount_applications")
    private ArrayList<String> discountApplications;

    @SerializedName("fulfillments")
    private ArrayList<String> fulfillments;

    @SerializedName("line_items")
    private ArrayList<LineItems> lineItems;

    @SerializedName("origin_location")
    private OriginLocation originLocation;

    @SerializedName("payment_terms")
    private String paymentTerms;

    private ArrayList<String> refunds;


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

    public Money getCurrentSubtotalPriceSet() {
        return currentSubtotalPriceSet;
    }

    public void setCurrentSubtotalPriceSet(Money currentSubtotalPriceSet) {
        this.currentSubtotalPriceSet = currentSubtotalPriceSet;
    }

    public Money getCurrentTotalDiscountsSet() {
        return currentTotalDiscountsSet;
    }

    public void setCurrentTotalDiscountsSet(Money currentTotalDiscountsSet) {
        this.currentTotalDiscountsSet = currentTotalDiscountsSet;
    }

    public String getCurrentTotalDiscounts() {
        return currentTotalDiscounts;
    }

    public void setCurrentTotalDiscounts(String currentTotalDiscounts) {
        this.currentTotalDiscounts = currentTotalDiscounts;
    }
}
