package com.classicLeathers.classic_leathers_inventory_api.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MYNTRA_SKUS")
public class MyntraSku {

    @Id
    @Column(name = "sku_id")
    private String skuId;

    @Column(name = "article_type")
    private String articleType;

    @Column(name = "brand")
    private String brand;

    @Column(name = "style_id")
    private String styleId;

    @Column(name = "style_name")
    private String styleName;

    @Column(name = "size")
    private String size;

    @Column(name = "seller_sku_code")
    private String sellerSkuCode;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "van")
    private String van;

    @Column(name = "mrp")
    private Double mrp;

    // Getters and Setters

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSellerSkuCode() {
        return sellerSkuCode;
    }

    public void setSellerSkuCode(String sellerSkuCode) {
        this.sellerSkuCode = sellerSkuCode;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getVan() {
        return van;
    }

    public void setVan(String van) {
        this.van = van;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }
}