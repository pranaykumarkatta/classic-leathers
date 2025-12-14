package com.classicLeathers.classic_leathers_inventory_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER_DATA")
public class CustomerData {
    @Id
    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
