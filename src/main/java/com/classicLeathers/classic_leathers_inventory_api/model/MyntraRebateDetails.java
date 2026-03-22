package com.classicLeathers.classic_leathers_inventory_api.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MYNTRA_REBATE_DETAILS")
public class MyntraRebateDetails {

    @Id
    @Column(name = "Release_ID")
    private String releaseId;

    @Column(name = "Order_Created_Date")
    private String orderCreatedDate;

    @Column(name = "Event_Start_Date")
    private String eventStartDate;

    @Column(name = "Event_End_Date")
    private String eventEndDate;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Article")
    private String article;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Packing_Date")
    private String packingDate;

    @Column(name = "Delivery_Date")
    private String deliveryDate;

    @Column(name = "Returned_Date")
    private String returnedDate;

    @Column(name = "Order_Terminal_State")
    private String orderTerminalState;

    @Column(name = "Incentive_Eligible")
    private String incentiveEligible;

    @Column(name = "MRP")
    private String mrp;

    @Column(name = "Coupon_Discount")
    private String couponDiscount;

    @Column(name = "Product_Discount")
    private String productDiscount;

    @Column(name = "GMV")
    private String gmv;

    @Column(name = "TD_Percentage")
    private String tdPercentage;

    @Column(name = "Rebate_Percentage")
    private String rebatePercentage;

    @Column(name = "Rebate_Amount")
    private String rebateAmount;

    @Column(name = "Rebate_Amount_With_Tax")
    private String rebateAmountWithTax;

    @Column(name = "Seller_Name")
    private String sellerName;

    @Column(name = "Style_Id")
    private String styleId;

    @Column(name = "Report_Generation_Date")
    private String reportGenerationDate;

    @Column(name = "Report_Level")
    private String reportLevel;

    @Column(name = "Year")
    private String year;

    @Column(name = "Event_Name")
    private String eventName;

    @Column(name = "Term_Id")
    private String termId;

    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    public String getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public void setOrderCreatedDate(String orderCreatedDate) {
        this.orderCreatedDate = orderCreatedDate;
    }

    public String getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(String eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public String getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(String eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(String returnedDate) {
        this.returnedDate = returnedDate;
    }

    public String getOrderTerminalState() {
        return orderTerminalState;
    }

    public void setOrderTerminalState(String orderTerminalState) {
        this.orderTerminalState = orderTerminalState;
    }

    public String getIncentiveEligible() {
        return incentiveEligible;
    }

    public void setIncentiveEligible(String incentiveEligible) {
        this.incentiveEligible = incentiveEligible;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(String couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public String getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(String productDiscount) {
        this.productDiscount = productDiscount;
    }

    public String getGmv() {
        return gmv;
    }

    public void setGmv(String gmv) {
        this.gmv = gmv;
    }

    public String getTdPercentage() {
        return tdPercentage;
    }

    public void setTdPercentage(String tdPercentage) {
        this.tdPercentage = tdPercentage;
    }

    public String getRebatePercentage() {
        return rebatePercentage;
    }

    public void setRebatePercentage(String rebatePercentage) {
        this.rebatePercentage = rebatePercentage;
    }

    public String getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(String rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public String getRebateAmountWithTax() {
        return rebateAmountWithTax;
    }

    public void setRebateAmountWithTax(String rebateAmountWithTax) {
        this.rebateAmountWithTax = rebateAmountWithTax;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getReportGenerationDate() {
        return reportGenerationDate;
    }

    public void setReportGenerationDate(String reportGenerationDate) {
        this.reportGenerationDate = reportGenerationDate;
    }

    public String getReportLevel() {
        return reportLevel;
    }

    public void setReportLevel(String reportLevel) {
        this.reportLevel = reportLevel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }
}
