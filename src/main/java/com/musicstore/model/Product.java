package com.musicstore.model;

public class Product {

    private String productName;
    private String productCategory;
    private String producDescription;
    private double productPrice;
    private String productCondition;
    private String productStatus;
    private int unitInstock;
    private String productManufacturer;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProducDescription() {
        return producDescription;
    }

    public void setProducDescription(String producDescription) {
        this.producDescription = producDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInstock() {
        return unitInstock;
    }

    public void setUnitInstock(int unitInstock) {
        this.unitInstock = unitInstock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }
}
