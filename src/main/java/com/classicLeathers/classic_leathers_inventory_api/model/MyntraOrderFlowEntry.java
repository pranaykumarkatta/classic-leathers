package com.classicLeathers.classic_leathers_inventory_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MYNTRA_ORDER_FLOW_REPORT")
public class MyntraOrderFlowEntry {

    @Id
    @Column(name = "sale_order_code", nullable = false)
    private String saleOrderCode;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "packing_date")
    private String packingDate;

    @Column(name = "invoiceNumber")
    private String invoiceNumber;

    @Column(name = "product_sku_code")
    private String productSkuCode;

    @Column(name = "order_item_status")
    private String orderItemStatus;

    @Column(name = "promised_delivery_date")
    private String promisedDeliveryDate;

    @Column(name = "actual_delivery_date")
    private String actualDeliveryDate;

    @Column(name = "return_date")
    private String returnDate;

    @Column(name = "restocked_date")
    private String restockedDate;

    @Column(name = "return_type")
    private String returnType;

    @Column(name = "promised_settlement_date")
    private String promisedSettlementDate;

    @Column(name = "currency")
    private String currency;

    @Column(name = "customer_paid_amount")
    private String customerPaidAmount;

    @Column(name = "postpaid_amount")
    private String postpaidAmount;

    @Column(name = "prepaid_amount")
    private String prepaidAmount;

    @Column(name = "_mrp")
    private String mrp;

    @Column(name = "discount_amount")
    private String discountAmount;

    @Column(name = "shipping_case")
    private String shippingCase;

    @Column(name = "tax_rate")
    private String taxRate;

    @Column(name = "igst_amount")
    private String igstAmount;

    @Column(name = "cgst_amount")
    private String cgstAmount;

    @Column(name = "sgst_amount")
    private String sgstAmount;

    @Column(name = "tcs_igst_amt")
    private String tcsIgstAmt;

    @Column(name = "tcs_sgst_amt")
    private String tcsSgstAmt;

    @Column(name = "tcs_cgst_amt")
    private String tcsCgstAmt;

    @Column(name = "minimum_commission")
    private String minimumCommission;

    @Column(name = "commission_pct")
    private String commissionPct;

    @Column(name = "commission_total_amount")
    private String commissionTotalAmount;

    @Column(name = "total_commission_plus_tcs_deduction_fw")
    private String totalCommissionPlusTcsDeductionFw;

    @Column(name = "logistics_deduction_fw")
    private String logisticsDeductionFw;

    @Column(name = "customer_paid_amt_fw")
    private String customerPaidAmtFw;

    @Column(name = "total_settlement_fw")
    private String totalSettlementFw;

    @Column(name = "amount_pending_settlement_fw")
    private String amountPendingSettlementFw;

    @Column(name = "prepaid_commission_deduction_fw")
    private String prepaidCommissionDeductionFw;

    @Column(name = "prepaid_logistics_deduction_fw")
    private String prepaidLogisticsDeductionFw;

    @Column(name = "prepaid_payment_fw")
    private String prepaidPaymentFw;

    @Column(name = "postpaid_commission_deduction_fw")
    private String postpaidCommissionDeductionFw;

    @Column(name = "postpaid_logistics_deduction_fw")
    private String postpaidLogisticsDeductionFw;

    @Column(name = "postpaid_payment_fw")
    private String postpaidPaymentFw;

    @Column(name = "courier_name")
    private String courierName;

    @Column(name = "e_commerce_portal_name")
    private String eCommercePortalName;

    @Column(name = "hsn")
    private String hsn;

    @Column(name = "product_tax_category")
    private String productTaxCategory;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "brand")
    private String brand;

    @Column(name = "gender")
    private String gender;

    @Column(name = "article_type")
    private String articleType;

    @Column(name = "supply_type")
    private String supplyType;

    @Column(name = "is_try_and_buy")
    private String isTryAndBuy;

    @Column(name = "tracking_no")
    private String trackingNo;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_pincode")
    private String customerPincode;

    @Column(name = "customer_state")
    private String customerState;

    @Column(name = "igst_rate")
    private String igstRate;

    @Column(name = "cgst_rate")
    private String cgstRate;

    @Column(name = "sgst_rate")
    private String sgstRate;

    @Column(name = "taxable_amount")
    private String taxableAmount;

    @Column(name = "seller_gstn")
    private String sellerGstn;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "seller_state_code")
    private String sellerStateCode;

    @Column(name = "additional_amount")
    private String additionalAmount;

    @Column(name = "postpaid_amount_other")
    private String postpaidAmountOther;

    @Column(name = "prepaid_amount_other")
    private String prepaidAmountOther;

    @Column(name = "myntra_gstn")
    private String myntraGstn;

    @Column(name = "party_id_to")
    private String partyIdTo;

    @Column(name = "item_code")
    private String itemCode;

    @Column(name = "item_created_on")
    private String itemCreatedOn;

    @Column(name = "item_updated_on")
    private String itemUpdatedOn;

    @Column(name = "item_status")
    private String itemStatus;

    @Column(name = "grn_number")
    private String grnNumber;

    @Column(name = "grn_created")
    private String grnCreated;

    @Column(name = "vendor_code")
    private String vendorCode;

    @Column(name = "facility")
    private String facility;

    @Column(name = "item_type_name")
    private String itemTypeName;

    @Column(name = "mrp")
    private String mrpValue;

    @Column(name = "item_type_skuCode")
    private String itemTypeSkuCode;

    @Column(name = "vendor_skuCode")
    private String vendorSkuCode;

    @Column(name = "unit_price_without_tax")
    private String unitPriceWithoutTax;

    @Column(name = "unit_price_with_tax")
    private String unitPriceWithTax;

    @Column(name = "rejection_reason")
    private String rejectionReason;

    @Column(name = "gate_pass_no")
    private String gatePassNo;

    @Column(name = "gate_pass_type")
    private String gatePassType;

    @Column(name = "gate_pass_status")
    private String gatePassStatus;

    @Column(name = "gate_pass_created")
    private String gatePassCreated;

    @Column(name = "hsn_code")
    private String hsnCode;

    @Column(name = "invoice_number2")
    private String invoiceNumber2;

    @Column(name = "invoice_date")
    private String invoiceDate;

    @Column(name = "po_type")
    private String poType;

    @Column(name = "po_code")
    private String poCode;

    @Column(name = "po_created")
    private String poCreated;

    @Column(name = "sale_order_status")
    private String saleOrderStatus;

    @Column(name = "myntra_status_ogp")
    private String myntraStatusOgp;

    @Column(name = "vendor_style_code")
    private String vendorStyleCode;

    @Column(name = "asn_code")
    private String asnCode;

    @Column(name = "asn_created")
    private String asnCreated;

    @Column(name = "asn_packed")
    private String asnPacked;

    @Column(name = "asn_picked")
    private String asnPicked;

    @Column(name = "foci_supply_type")
    private String fociSupplyType;

    public String getSaleOrderCode() {
        return saleOrderCode;
    }

    public void setSaleOrderCode(String saleOrderCode) {
        this.saleOrderCode = saleOrderCode;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPackingDate() {
        return packingDate;
    }

    public void setPackingDate(String packingDate) {
        this.packingDate = packingDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public String getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(String orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }

    public String getPromisedDeliveryDate() {
        return promisedDeliveryDate;
    }

    public void setPromisedDeliveryDate(String promisedDeliveryDate) {
        this.promisedDeliveryDate = promisedDeliveryDate;
    }

    public String getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public void setActualDeliveryDate(String actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getRestockedDate() {
        return restockedDate;
    }

    public void setRestockedDate(String restockedDate) {
        this.restockedDate = restockedDate;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getPromisedSettlementDate() {
        return promisedSettlementDate;
    }

    public void setPromisedSettlementDate(String promisedSettlementDate) {
        this.promisedSettlementDate = promisedSettlementDate;
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

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getShippingCase() {
        return shippingCase;
    }

    public void setShippingCase(String shippingCase) {
        this.shippingCase = shippingCase;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
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

    public String getTcsIgstAmt() {
        return tcsIgstAmt;
    }

    public void setTcsIgstAmt(String tcsIgstAmt) {
        this.tcsIgstAmt = tcsIgstAmt;
    }

    public String getTcsSgstAmt() {
        return tcsSgstAmt;
    }

    public void setTcsSgstAmt(String tcsSgstAmt) {
        this.tcsSgstAmt = tcsSgstAmt;
    }

    public String getTcsCgstAmt() {
        return tcsCgstAmt;
    }

    public void setTcsCgstAmt(String tcsCgstAmt) {
        this.tcsCgstAmt = tcsCgstAmt;
    }

    public String getMinimumCommission() {
        return minimumCommission;
    }

    public void setMinimumCommission(String minimumCommission) {
        this.minimumCommission = minimumCommission;
    }

    public String getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(String commissionPct) {
        this.commissionPct = commissionPct;
    }

    public String getCommissionTotalAmount() {
        return commissionTotalAmount;
    }

    public void setCommissionTotalAmount(String commissionTotalAmount) {
        this.commissionTotalAmount = commissionTotalAmount;
    }

    public String getTotalCommissionPlusTcsDeductionFw() {
        return totalCommissionPlusTcsDeductionFw;
    }

    public void setTotalCommissionPlusTcsDeductionFw(String totalCommissionPlusTcsDeductionFw) {
        this.totalCommissionPlusTcsDeductionFw = totalCommissionPlusTcsDeductionFw;
    }

    public String getLogisticsDeductionFw() {
        return logisticsDeductionFw;
    }

    public void setLogisticsDeductionFw(String logisticsDeductionFw) {
        this.logisticsDeductionFw = logisticsDeductionFw;
    }

    public String getCustomerPaidAmtFw() {
        return customerPaidAmtFw;
    }

    public void setCustomerPaidAmtFw(String customerPaidAmtFw) {
        this.customerPaidAmtFw = customerPaidAmtFw;
    }

    public String getTotalSettlementFw() {
        return totalSettlementFw;
    }

    public void setTotalSettlementFw(String totalSettlementFw) {
        this.totalSettlementFw = totalSettlementFw;
    }

    public String getAmountPendingSettlementFw() {
        return amountPendingSettlementFw;
    }

    public void setAmountPendingSettlementFw(String amountPendingSettlementFw) {
        this.amountPendingSettlementFw = amountPendingSettlementFw;
    }

    public String getPrepaidCommissionDeductionFw() {
        return prepaidCommissionDeductionFw;
    }

    public void setPrepaidCommissionDeductionFw(String prepaidCommissionDeductionFw) {
        this.prepaidCommissionDeductionFw = prepaidCommissionDeductionFw;
    }

    public String getPrepaidLogisticsDeductionFw() {
        return prepaidLogisticsDeductionFw;
    }

    public void setPrepaidLogisticsDeductionFw(String prepaidLogisticsDeductionFw) {
        this.prepaidLogisticsDeductionFw = prepaidLogisticsDeductionFw;
    }

    public String getPrepaidPaymentFw() {
        return prepaidPaymentFw;
    }

    public void setPrepaidPaymentFw(String prepaidPaymentFw) {
        this.prepaidPaymentFw = prepaidPaymentFw;
    }

    public String getPostpaidCommissionDeductionFw() {
        return postpaidCommissionDeductionFw;
    }

    public void setPostpaidCommissionDeductionFw(String postpaidCommissionDeductionFw) {
        this.postpaidCommissionDeductionFw = postpaidCommissionDeductionFw;
    }

    public String getPostpaidLogisticsDeductionFw() {
        return postpaidLogisticsDeductionFw;
    }

    public void setPostpaidLogisticsDeductionFw(String postpaidLogisticsDeductionFw) {
        this.postpaidLogisticsDeductionFw = postpaidLogisticsDeductionFw;
    }

    public String getPostpaidPaymentFw() {
        return postpaidPaymentFw;
    }

    public void setPostpaidPaymentFw(String postpaidPaymentFw) {
        this.postpaidPaymentFw = postpaidPaymentFw;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String geteCommercePortalName() {
        return eCommercePortalName;
    }

    public void seteCommercePortalName(String eCommercePortalName) {
        this.eCommercePortalName = eCommercePortalName;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public String getProductTaxCategory() {
        return productTaxCategory;
    }

    public void setProductTaxCategory(String productTaxCategory) {
        this.productTaxCategory = productTaxCategory;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public String getIsTryAndBuy() {
        return isTryAndBuy;
    }

    public void setIsTryAndBuy(String isTryAndBuy) {
        this.isTryAndBuy = isTryAndBuy;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPincode() {
        return customerPincode;
    }

    public void setCustomerPincode(String customerPincode) {
        this.customerPincode = customerPincode;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getIgstRate() {
        return igstRate;
    }

    public void setIgstRate(String igstRate) {
        this.igstRate = igstRate;
    }

    public String getCgstRate() {
        return cgstRate;
    }

    public void setCgstRate(String cgstRate) {
        this.cgstRate = cgstRate;
    }

    public String getSgstRate() {
        return sgstRate;
    }

    public void setSgstRate(String sgstRate) {
        this.sgstRate = sgstRate;
    }

    public String getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(String taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public String getSellerGstn() {
        return sellerGstn;
    }

    public void setSellerGstn(String sellerGstn) {
        this.sellerGstn = sellerGstn;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerStateCode() {
        return sellerStateCode;
    }

    public void setSellerStateCode(String sellerStateCode) {
        this.sellerStateCode = sellerStateCode;
    }

    public String getAdditionalAmount() {
        return additionalAmount;
    }

    public void setAdditionalAmount(String additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public String getPostpaidAmountOther() {
        return postpaidAmountOther;
    }

    public void setPostpaidAmountOther(String postpaidAmountOther) {
        this.postpaidAmountOther = postpaidAmountOther;
    }

    public String getPrepaidAmountOther() {
        return prepaidAmountOther;
    }

    public void setPrepaidAmountOther(String prepaidAmountOther) {
        this.prepaidAmountOther = prepaidAmountOther;
    }

    public String getMyntraGstn() {
        return myntraGstn;
    }

    public void setMyntraGstn(String myntraGstn) {
        this.myntraGstn = myntraGstn;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCreatedOn() {
        return itemCreatedOn;
    }

    public void setItemCreatedOn(String itemCreatedOn) {
        this.itemCreatedOn = itemCreatedOn;
    }

    public String getItemUpdatedOn() {
        return itemUpdatedOn;
    }

    public void setItemUpdatedOn(String itemUpdatedOn) {
        this.itemUpdatedOn = itemUpdatedOn;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getGrnNumber() {
        return grnNumber;
    }

    public void setGrnNumber(String grnNumber) {
        this.grnNumber = grnNumber;
    }

    public String getGrnCreated() {
        return grnCreated;
    }

    public void setGrnCreated(String grnCreated) {
        this.grnCreated = grnCreated;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public String getMrpValue() {
        return mrpValue;
    }

    public void setMrpValue(String mrpValue) {
        this.mrpValue = mrpValue;
    }

    public String getItemTypeSkuCode() {
        return itemTypeSkuCode;
    }

    public void setItemTypeSkuCode(String itemTypeSkuCode) {
        this.itemTypeSkuCode = itemTypeSkuCode;
    }

    public String getVendorSkuCode() {
        return vendorSkuCode;
    }

    public void setVendorSkuCode(String vendorSkuCode) {
        this.vendorSkuCode = vendorSkuCode;
    }

    public String getUnitPriceWithoutTax() {
        return unitPriceWithoutTax;
    }

    public void setUnitPriceWithoutTax(String unitPriceWithoutTax) {
        this.unitPriceWithoutTax = unitPriceWithoutTax;
    }

    public String getUnitPriceWithTax() {
        return unitPriceWithTax;
    }

    public void setUnitPriceWithTax(String unitPriceWithTax) {
        this.unitPriceWithTax = unitPriceWithTax;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public String getGatePassNo() {
        return gatePassNo;
    }

    public void setGatePassNo(String gatePassNo) {
        this.gatePassNo = gatePassNo;
    }

    public String getGatePassType() {
        return gatePassType;
    }

    public void setGatePassType(String gatePassType) {
        this.gatePassType = gatePassType;
    }

    public String getGatePassStatus() {
        return gatePassStatus;
    }

    public void setGatePassStatus(String gatePassStatus) {
        this.gatePassStatus = gatePassStatus;
    }

    public String getGatePassCreated() {
        return gatePassCreated;
    }

    public void setGatePassCreated(String gatePassCreated) {
        this.gatePassCreated = gatePassCreated;
    }

    public String getHsnCode() {
        return hsnCode;
    }

    public void setHsnCode(String hsnCode) {
        this.hsnCode = hsnCode;
    }

    public String getInvoiceNumber2() {
        return invoiceNumber2;
    }

    public void setInvoiceNumber2(String invoiceNumber2) {
        this.invoiceNumber2 = invoiceNumber2;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getPoType() {
        return poType;
    }

    public void setPoType(String poType) {
        this.poType = poType;
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode;
    }

    public String getPoCreated() {
        return poCreated;
    }

    public void setPoCreated(String poCreated) {
        this.poCreated = poCreated;
    }

    public String getSaleOrderStatus() {
        return saleOrderStatus;
    }

    public void setSaleOrderStatus(String saleOrderStatus) {
        this.saleOrderStatus = saleOrderStatus;
    }

    public String getMyntraStatusOgp() {
        return myntraStatusOgp;
    }

    public void setMyntraStatusOgp(String myntraStatusOgp) {
        this.myntraStatusOgp = myntraStatusOgp;
    }

    public String getVendorStyleCode() {
        return vendorStyleCode;
    }

    public void setVendorStyleCode(String vendorStyleCode) {
        this.vendorStyleCode = vendorStyleCode;
    }

    public String getAsnCode() {
        return asnCode;
    }

    public void setAsnCode(String asnCode) {
        this.asnCode = asnCode;
    }

    public String getAsnCreated() {
        return asnCreated;
    }

    public void setAsnCreated(String asnCreated) {
        this.asnCreated = asnCreated;
    }

    public String getAsnPacked() {
        return asnPacked;
    }

    public void setAsnPacked(String asnPacked) {
        this.asnPacked = asnPacked;
    }

    public String getAsnPicked() {
        return asnPicked;
    }

    public void setAsnPicked(String asnPicked) {
        this.asnPicked = asnPicked;
    }

    public String getFociSupplyType() {
        return fociSupplyType;
    }

    public void setFociSupplyType(String fociSupplyType) {
        this.fociSupplyType = fociSupplyType;
    }
}
