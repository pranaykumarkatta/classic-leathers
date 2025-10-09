package com.classicLeathers.classic_leathers_inventory_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unicommerce_shipments")
public class UnicommerceShipment {

    @Id
    private String shipment;
    private String readyForQuickPacking;
    private String giftMessages;
    private String itemContains;
    private String products;
    private String channel;
    private String status;
    private String priority;
    private String picklist;
    private String invoiceNo;
    private String onHold;
    private String state;
    private String fulfillmentTat;
    private String regulatoryForms;
    private String batchNo;
    private String shipping;
    private String paymentMethod;
    private String created;
    private String action;
    private String displayOrderNo;
    private String shipmentSerialNumber;
    private String containsGiftWrap;
    private String channelCode;
    private String channelId;
    private String itemTypeSkus;
    private String itemTypeIds;
    private String sellerSkus;
    private String itemIdDetails;
    private String sellerSkuDetails;
    private String shippingProvider;
    private String shippingProviderCode;
    private String shippingCourier;
    private String awb;
    private String dispatchTime;
    private String shippingArrangedBy;
    private String productManagementSwitchedOdd;
    private String labelFormat;
    private String itemDetailsList;
    private String itemDetailingPending;
    private String putawayPending;
    private String weight;
    private String length;
    private String width;
    private String height;
    private String packageType;
    private String numberOfBoxes;
    private String singleActionInvoiceLabelNew;
    private String orderItemIds;
    private String shippingPackageTypeScannableSource;

    public void trimFields() {
        shipment = trimString(shipment);
        readyForQuickPacking = trimString(readyForQuickPacking);
        giftMessages = trimString(giftMessages);
        itemContains = trimString(itemContains);
        products = trimString(products);
        channel = trimString(channel);
        status = trimString(status);
        priority = trimString(priority);
        picklist = trimString(picklist);
        invoiceNo = trimString(invoiceNo);
        onHold = trimString(onHold);
        state = trimString(state);
        fulfillmentTat = trimString(fulfillmentTat);
        regulatoryForms = trimString(regulatoryForms);
        batchNo = trimString(batchNo);
        shipping = trimString(shipping);
        paymentMethod = trimString(paymentMethod);
        created = trimString(created);
        action = trimString(action);
        displayOrderNo = trimString(displayOrderNo);
        containsGiftWrap = trimString(containsGiftWrap);
        channelCode = trimString(channelCode);
        channelId = trimString(channelId);
        itemTypeSkus = trimString(itemTypeSkus);
        itemTypeIds = trimString(itemTypeIds);
        sellerSkus = trimString(sellerSkus);
        itemIdDetails = trimString(itemIdDetails);
        sellerSkuDetails = trimString(sellerSkuDetails);
        shippingProvider = trimString(shippingProvider);
        shippingProviderCode = trimString(shippingProviderCode);
        shippingCourier = trimString(shippingCourier);
        awb = trimString(awb);
        dispatchTime = trimString(dispatchTime);
        shippingArrangedBy = trimString(shippingArrangedBy);
        productManagementSwitchedOdd = trimString(productManagementSwitchedOdd);
        labelFormat = trimString(labelFormat);
        itemDetailsList = trimString(itemDetailsList);
        itemDetailingPending = trimString(itemDetailingPending);
        putawayPending = trimString(putawayPending);
        weight = trimString(weight);
        length = trimString(length);
        width = trimString(width);
        height = trimString(height);
        packageType = trimString(packageType);
        numberOfBoxes = trimString(numberOfBoxes);
        singleActionInvoiceLabelNew = trimString(singleActionInvoiceLabelNew);
        orderItemIds = trimString(orderItemIds);
        shippingPackageTypeScannableSource = trimString(shippingPackageTypeScannableSource);
    }

    private String trimString(String value) {

        if (value != null && value.length() > 250) {
            return value.substring(0, 250);
        } else {
            return value;
        }
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    public String getReadyForQuickPacking() {
        return readyForQuickPacking;
    }

    public void setReadyForQuickPacking(String readyForQuickPacking) {
        this.readyForQuickPacking = readyForQuickPacking;
    }

    public String getGiftMessages() {
        return giftMessages;
    }

    public void setGiftMessages(String giftMessages) {
        this.giftMessages = giftMessages;
    }

    public String getItemContains() {
        return itemContains;
    }

    public void setItemContains(String itemContains) {
        this.itemContains = itemContains;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPicklist() {
        return picklist;
    }

    public void setPicklist(String picklist) {
        this.picklist = picklist;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getOnHold() {
        return onHold;
    }

    public void setOnHold(String onHold) {
        this.onHold = onHold;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFulfillmentTat() {
        return fulfillmentTat;
    }

    public void setFulfillmentTat(String fulfillmentTat) {
        this.fulfillmentTat = fulfillmentTat;
    }

    public String getRegulatoryForms() {
        return regulatoryForms;
    }

    public void setRegulatoryForms(String regulatoryForms) {
        this.regulatoryForms = regulatoryForms;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getShipmentSerialNumber() {
        return shipmentSerialNumber;
    }

    public void setShipmentSerialNumber(String shipmentSerialNumber) {
        this.shipmentSerialNumber = shipmentSerialNumber;
    }

    public String getDisplayOrderNo() {
        return displayOrderNo;
    }

    public void setDisplayOrderNo(String displayOrderNo) {
        this.displayOrderNo = displayOrderNo;
    }

    public String getContainsGiftWrap() {
        return containsGiftWrap;
    }

    public void setContainsGiftWrap(String containsGiftWrap) {
        this.containsGiftWrap = containsGiftWrap;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getItemTypeSkus() {
        return itemTypeSkus;
    }

    public void setItemTypeSkus(String itemTypeSkus) {
        this.itemTypeSkus = itemTypeSkus;
    }

    public String getItemTypeIds() {
        return itemTypeIds;
    }

    public void setItemTypeIds(String itemTypeIds) {
        this.itemTypeIds = itemTypeIds;
    }

    public String getSellerSkus() {
        return sellerSkus;
    }

    public void setSellerSkus(String sellerSkus) {
        this.sellerSkus = sellerSkus;
    }

    public String getItemIdDetails() {
        return itemIdDetails;
    }

    public void setItemIdDetails(String itemIdDetails) {
        this.itemIdDetails = itemIdDetails;
    }

    public String getSellerSkuDetails() {
        return sellerSkuDetails;
    }

    public void setSellerSkuDetails(String sellerSkuDetails) {
        this.sellerSkuDetails = sellerSkuDetails;
    }

    public String getShippingProvider() {
        return shippingProvider;
    }

    public void setShippingProvider(String shippingProvider) {
        this.shippingProvider = shippingProvider;
    }

    public String getShippingProviderCode() {
        return shippingProviderCode;
    }

    public void setShippingProviderCode(String shippingProviderCode) {
        this.shippingProviderCode = shippingProviderCode;
    }

    public String getShippingCourier() {
        return shippingCourier;
    }

    public void setShippingCourier(String shippingCourier) {
        this.shippingCourier = shippingCourier;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(String dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getShippingArrangedBy() {
        return shippingArrangedBy;
    }

    public void setShippingArrangedBy(String shippingArrangedBy) {
        this.shippingArrangedBy = shippingArrangedBy;
    }

    public String getProductManagementSwitchedOdd() {
        return productManagementSwitchedOdd;
    }

    public void setProductManagementSwitchedOdd(String productManagementSwitchedOdd) {
        this.productManagementSwitchedOdd = productManagementSwitchedOdd;
    }

    public String getLabelFormat() {
        return labelFormat;
    }

    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
    }

    public String getItemDetailsList() {
        return itemDetailsList;
    }

    public void setItemDetailsList(String itemDetailsList) {
        this.itemDetailsList = itemDetailsList;
    }

    public String getItemDetailingPending() {
        return itemDetailingPending;
    }

    public void setItemDetailingPending(String itemDetailingPending) {
        this.itemDetailingPending = itemDetailingPending;
    }

    public String getPutawayPending() {
        return putawayPending;
    }

    public void setPutawayPending(String putawayPending) {
        this.putawayPending = putawayPending;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getNumberOfBoxes() {
        return numberOfBoxes;
    }

    public void setNumberOfBoxes(String numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    public String getSingleActionInvoiceLabelNew() {
        return singleActionInvoiceLabelNew;
    }

    public void setSingleActionInvoiceLabelNew(String singleActionInvoiceLabelNew) {
        this.singleActionInvoiceLabelNew = singleActionInvoiceLabelNew;
    }

    public String getOrderItemIds() {
        return orderItemIds;
    }

    public void setOrderItemIds(String orderItemIds) {
        this.orderItemIds = orderItemIds;
    }

    public String getShippingPackageTypeScannableSource() {
        return shippingPackageTypeScannableSource;
    }

    public void setShippingPackageTypeScannableSource(String shippingPackageTypeScannableSource) {
        this.shippingPackageTypeScannableSource = shippingPackageTypeScannableSource;
    }
}
