package com.classicLeathers.classic_leathers_inventory_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MYNTRA_ADVERTISEMENT_DETAILS")
public class MyntraAdvertisementEntry {
    @Id
    @Column(name = "id")
    private String id;
    private String year;
    private String month;
    private String productId;
    private String productName;
    private String productImageUrl;
    private String impressions;
    private String views;
    private String clicks;
    private String ctr; // Click Through Rate
    private String cvr; // Conversion Rate
    private String advertiserSpendInINR;
    private String unitsSoldDirect;
    private String unitsSoldIndirect;
    private String unitsSold;
    private String revenueDirectInINR;
    private String revenueIndirectInINR;
    private String totalRevenueInINR;
    private String roiDirect;
    private String roiIndirect;
    private String totalRoi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getImpressions() {
        return impressions;
    }

    public void setImpressions(String impressions) {
        this.impressions = impressions;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getClicks() {
        return clicks;
    }

    public void setClicks(String clicks) {
        this.clicks = clicks;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getAdvertiserSpendInINR() {
        return advertiserSpendInINR;
    }

    public void setAdvertiserSpendInINR(String advertiserSpendInINR) {
        this.advertiserSpendInINR = advertiserSpendInINR;
    }

    public String getUnitsSoldDirect() {
        return unitsSoldDirect;
    }

    public void setUnitsSoldDirect(String unitsSoldDirect) {
        this.unitsSoldDirect = unitsSoldDirect;
    }

    public String getUnitsSoldIndirect() {
        return unitsSoldIndirect;
    }

    public void setUnitsSoldIndirect(String unitsSoldIndirect) {
        this.unitsSoldIndirect = unitsSoldIndirect;
    }

    public String getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(String unitsSold) {
        this.unitsSold = unitsSold;
    }

    public String getRevenueDirectInINR() {
        return revenueDirectInINR;
    }

    public void setRevenueDirectInINR(String revenueDirectInINR) {
        this.revenueDirectInINR = revenueDirectInINR;
    }

    public String getRevenueIndirectInINR() {
        return revenueIndirectInINR;
    }

    public void setRevenueIndirectInINR(String revenueIndirectInINR) {
        this.revenueIndirectInINR = revenueIndirectInINR;
    }

    public String getTotalRevenueInINR() {
        return totalRevenueInINR;
    }

    public void setTotalRevenueInINR(String totalRevenueInINR) {
        this.totalRevenueInINR = totalRevenueInINR;
    }

    public String getRoiDirect() {
        return roiDirect;
    }

    public void setRoiDirect(String roiDirect) {
        this.roiDirect = roiDirect;
    }

    public String getRoiIndirect() {
        return roiIndirect;
    }

    public void setRoiIndirect(String roiIndirect) {
        this.roiIndirect = roiIndirect;
    }

    public String getTotalRoi() {
        return totalRoi;
    }

    public void setTotalRoi(String totalRoi) {
        this.totalRoi = totalRoi;
    }
}

