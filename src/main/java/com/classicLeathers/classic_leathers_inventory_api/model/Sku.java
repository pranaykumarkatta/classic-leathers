package com.classicLeathers.classic_leathers_inventory_api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "sku", schema = "public")
public class Sku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "brand", length = 255)
    private String brand;

    @Column(name = "category", length = 255)
    private String category;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "mrp")
    private Integer mrp;

    @Column(name = "online_sku")
    private Boolean onlineSku;

    @Column(name = "purchase_cost")
    private Integer purchaseCost;

    @Column(name = "sku_label", length = 255)
    private String skuLabel;

    @Column(name = "sub_category", length = 255)
    private String subCategory;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMrp() {
        return mrp;
    }

    public void setMrp(Integer mrp) {
        this.mrp = mrp;
    }

    public Boolean getOnlineSku() {
        return onlineSku;
    }

    public void setOnlineSku(Boolean onlineSku) {
        this.onlineSku = onlineSku;
    }

    public Integer getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(Integer purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public String getSkuLabel() {
        return skuLabel;
    }

    public void setSkuLabel(String skuLabel) {
        this.skuLabel = skuLabel;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "Sku{" + "id=" + id + ", brand='" + brand + '\'' + ", category='" + category + '\'' + ", createdOn=" + createdOn + ", description='" + description + '\'' + ", mrp=" + mrp + ", onlineSku=" + onlineSku + ", purchaseCost=" + purchaseCost + ", skuLabel='" + skuLabel + '\'' + ", subCategory='" + subCategory + '\'' + ", updatedOn=" + updatedOn + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sku sku)) return false;
        return Objects.equals(getBrand(), sku.getBrand()) && Objects.equals(getCategory(), sku.getCategory()) && Objects.equals(getCreatedOn(), sku.getCreatedOn()) && Objects.equals(getDescription(), sku.getDescription()) && Objects.equals(getMrp(), sku.getMrp()) && Objects.equals(getOnlineSku(), sku.getOnlineSku()) && Objects.equals(getPurchaseCost(), sku.getPurchaseCost()) && Objects.equals(getSkuLabel(), sku.getSkuLabel()) && Objects.equals(getSubCategory(), sku.getSubCategory()) && Objects.equals(getUpdatedOn(), sku.getUpdatedOn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getCategory(), getCreatedOn(), getDescription(), getMrp(), getOnlineSku(), getPurchaseCost(), getSkuLabel(), getSubCategory(), getUpdatedOn());
    }
}
