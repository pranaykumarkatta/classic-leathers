package com.classicLeathers.classic_leathers_inventory_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MYNTRA_RETURN_SETTLEMENT_REPORT")
public class MyntraReturnSettlementEntry {
    @Id
    @Column(name = "order_release_id")
    private String orderReleaseId;

    @Column(name = "order_line_id")
    private String orderLineId;

    @Column(name = "return_type")
    private String returnType;

    @Column(name = "return_date")
    private String returnDate;

    @Column(name = "packing_date")
    private String packingDate;

    @Column(name = "delivery_date")
    private String deliveryDate;

    @Column(name = "ecommerce_portal_name")
    private String ecommercePortalName;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "packet_id")
    private String packetId;

    @Column(name = "hsn_code")
    private String hsnCode;

    @Column(name = "product_tax_category")
    private String productTaxCategory;

    @Column(name = "currency")
    private String currency;

    @Column(name = "customer_paid_amount")
    private String customerPaidAmount;

    @Column(name = "postpaid_amount")
    private String postpaidAmount;

    @Column(name = "prepaid_amount")
    private String prepaidAmount;

    @Column(name = "mrp")
    private String mrp;

    @Column(name = "total_discount_amount")
    private String totalDiscountAmount;

    @Column(name = "shipping_case")
    private String shippingCase;

    @Column(name = "total_tax_rate")
    private String totalTaxRate;

    @Column(name = "igst_amount")
    private String igstAmount;

    @Column(name = "cgst_amount")
    private String cgstAmount;

    @Column(name = "sgst_amount")
    private String sgstAmount;

    @Column(name = "tcs_amount")
    private String tcsAmount;

    @Column(name = "tds_amount")
    private String tdsAmount;

    @Column(name = "commission_percentage")
    private String commissionPercentage;

    @Column(name = "minimum_commission")
    private String minimumCommission;

    @Column(name = "platform_fees")
    private String platformFees;

    @Column(name = "total_commission")
    private String totalCommission;

    @Column(name = "total_commission_plus_tcs_tds_deduction")
    private String totalCommissionPlusTcsTdsDeduction;

    @Column(name = "total_logistics_deduction")
    private String totalLogisticsDeduction;

    @Column(name = "shipping_fee")
    private String shippingFee;

    @Column(name = "fixed_fee")
    private String fixedFee;

    @Column(name = "pick_and_pack_fee")
    private String pickAndPackFee;

    @Column(name = "payment_gateway_fee")
    private String paymentGatewayFee;

    @Column(name = "total_tax_on_logistics")
    private String totalTaxOnLogistics;

    @Column(name = "article_level")
    private String articleLevel;

    @Column(name = "shipment_zone_classification")
    private String shipmentZoneClassification;

    @Column(name = "customer_paid_amt")
    private String customerPaidAmt;

    @Column(name = "total_expected_settlement")
    private String totalExpectedSettlement;

    @Column(name = "total_actual_settlement")
    private String totalActualSettlement;

    @Column(name = "amount_pending_settlement")
    private String amountPendingSettlement;

    @Column(name = "prepaid_commission_deduction")
    private String prepaidCommissionDeduction;

    @Column(name = "prepaid_logistics_deduction")
    private String prepaidLogisticsDeduction;

    @Column(name = "prepaid_payment")
    private String prepaidPayment;

    @Column(name = "postpaid_commission_deduction")
    private String postpaidCommissionDeduction;

    @Column(name = "postpaid_logistics_deduction")
    private String postpaidLogisticsDeduction;

    @Column(name = "postpaid_payment")
    private String postpaidPayment;

    @Column(name = "seller_order_id")
    private String sellerOrderId;

    public String getOrderReleaseId() {
        return orderReleaseId;
    }

    public void setOrderReleaseId(String orderReleaseId) {
        this.orderReleaseId = orderReleaseId;
    }

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getPackingDate() {
        return packingDate;
    }

    public void setPackingDate(String packingDate) {
        this.packingDate = packingDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getEcommercePortalName() {
        return ecommercePortalName;
    }

    public void setEcommercePortalName(String ecommercePortalName) {
        this.ecommercePortalName = ecommercePortalName;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPacketId() {
        return packetId;
    }

    public void setPacketId(String packetId) {
        this.packetId = packetId;
    }

    public String getHsnCode() {
        return hsnCode;
    }

    public void setHsnCode(String hsnCode) {
        this.hsnCode = hsnCode;
    }

    public String getProductTaxCategory() {
        return productTaxCategory;
    }

    public void setProductTaxCategory(String productTaxCategory) {
        this.productTaxCategory = productTaxCategory;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerPaidAmount() {
        return customerPaidAmount;
    }

    public void setCustomerPaidAmount(String customerPaidAmount) {
        this.customerPaidAmount = customerPaidAmount;
    }

    public String getPostpaidAmount() {
        return postpaidAmount;
    }

    public void setPostpaidAmount(String postpaidAmount) {
        this.postpaidAmount = postpaidAmount;
    }

    public String getPrepaidAmount() {
        return prepaidAmount;
    }

    public void setPrepaidAmount(String prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(String totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public String getShippingCase() {
        return shippingCase;
    }

    public void setShippingCase(String shippingCase) {
        this.shippingCase = shippingCase;
    }

    public String getTotalTaxRate() {
        return totalTaxRate;
    }

    public void setTotalTaxRate(String totalTaxRate) {
        this.totalTaxRate = totalTaxRate;
    }

    public String getIgstAmount() {
        return igstAmount;
    }

    public void setIgstAmount(String igstAmount) {
        this.igstAmount = igstAmount;
    }

    public String getCgstAmount() {
        return cgstAmount;
    }

    public void setCgstAmount(String cgstAmount) {
        this.cgstAmount = cgstAmount;
    }

    public String getSgstAmount() {
        return sgstAmount;
    }

    public void setSgstAmount(String sgstAmount) {
        this.sgstAmount = sgstAmount;
    }

    public String getTcsAmount() {
        return tcsAmount;
    }

    public void setTcsAmount(String tcsAmount) {
        this.tcsAmount = tcsAmount;
    }

    public String getTdsAmount() {
        return tdsAmount;
    }

    public void setTdsAmount(String tdsAmount) {
        this.tdsAmount = tdsAmount;
    }

    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(String commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public String getMinimumCommission() {
        return minimumCommission;
    }

    public void setMinimumCommission(String minimumCommission) {
        this.minimumCommission = minimumCommission;
    }

    public String getPlatformFees() {
        return platformFees;
    }

    public void setPlatformFees(String platformFees) {
        this.platformFees = platformFees;
    }

    public String getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(String totalCommission) {
        this.totalCommission = totalCommission;
    }

    public String getTotalCommissionPlusTcsTdsDeduction() {
        return totalCommissionPlusTcsTdsDeduction;
    }

    public void setTotalCommissionPlusTcsTdsDeduction(String totalCommissionPlusTcsTdsDeduction) {
        this.totalCommissionPlusTcsTdsDeduction = totalCommissionPlusTcsTdsDeduction;
    }

    public String getTotalLogisticsDeduction() {
        return totalLogisticsDeduction;
    }

    public void setTotalLogisticsDeduction(String totalLogisticsDeduction) {
        this.totalLogisticsDeduction = totalLogisticsDeduction;
    }

    public String getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(String shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(String fixedFee) {
        this.fixedFee = fixedFee;
    }

    public String getPickAndPackFee() {
        return pickAndPackFee;
    }

    public void setPickAndPackFee(String pickAndPackFee) {
        this.pickAndPackFee = pickAndPackFee;
    }

    public String getPaymentGatewayFee() {
        return paymentGatewayFee;
    }

    public void setPaymentGatewayFee(String paymentGatewayFee) {
        this.paymentGatewayFee = paymentGatewayFee;
    }

    public String getTotalTaxOnLogistics() {
        return totalTaxOnLogistics;
    }

    public void setTotalTaxOnLogistics(String totalTaxOnLogistics) {
        this.totalTaxOnLogistics = totalTaxOnLogistics;
    }

    public String getArticleLevel() {
        return articleLevel;
    }

    public void setArticleLevel(String articleLevel) {
        this.articleLevel = articleLevel;
    }

    public String getShipmentZoneClassification() {
        return shipmentZoneClassification;
    }

    public void setShipmentZoneClassification(String shipmentZoneClassification) {
        this.shipmentZoneClassification = shipmentZoneClassification;
    }

    public String getCustomerPaidAmt() {
        return customerPaidAmt;
    }

    public void setCustomerPaidAmt(String customerPaidAmt) {
        this.customerPaidAmt = customerPaidAmt;
    }

    public String getTotalExpectedSettlement() {
        return totalExpectedSettlement;
    }

    public void setTotalExpectedSettlement(String totalExpectedSettlement) {
        this.totalExpectedSettlement = totalExpectedSettlement;
    }

    public String getTotalActualSettlement() {
        return totalActualSettlement;
    }

    public void setTotalActualSettlement(String totalActualSettlement) {
        this.totalActualSettlement = totalActualSettlement;
    }

    public String getAmountPendingSettlement() {
        return amountPendingSettlement;
    }

    public void setAmountPendingSettlement(String amountPendingSettlement) {
        this.amountPendingSettlement = amountPendingSettlement;
    }

    public String getPrepaidCommissionDeduction() {
        return prepaidCommissionDeduction;
    }

    public void setPrepaidCommissionDeduction(String prepaidCommissionDeduction) {
        this.prepaidCommissionDeduction = prepaidCommissionDeduction;
    }

    public String getPrepaidLogisticsDeduction() {
        return prepaidLogisticsDeduction;
    }

    public void setPrepaidLogisticsDeduction(String prepaidLogisticsDeduction) {
        this.prepaidLogisticsDeduction = prepaidLogisticsDeduction;
    }

    public String getPrepaidPayment() {
        return prepaidPayment;
    }

    public void setPrepaidPayment(String prepaidPayment) {
        this.prepaidPayment = prepaidPayment;
    }

    public String getPostpaidCommissionDeduction() {
        return postpaidCommissionDeduction;
    }

    public void setPostpaidCommissionDeduction(String postpaidCommissionDeduction) {
        this.postpaidCommissionDeduction = postpaidCommissionDeduction;
    }

    public String getPostpaidLogisticsDeduction() {
        return postpaidLogisticsDeduction;
    }

    public void setPostpaidLogisticsDeduction(String postpaidLogisticsDeduction) {
        this.postpaidLogisticsDeduction = postpaidLogisticsDeduction;
    }

    public String getPostpaidPayment() {
        return postpaidPayment;
    }

    public void setPostpaidPayment(String postpaidPayment) {
        this.postpaidPayment = postpaidPayment;
    }

    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }
}
