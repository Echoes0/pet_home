package com.example.springboot_pet_home.entity;


public class Product {

  private long productId;
  private String productName;
  private String productDescription;
  private double productPrice;
  private long productStock;
  private String status;
  private long shopId;
  private long categoryId;


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public long getProductStock() {
    return productStock;
  }

  public void setProductStock(long productStock) {
    this.productStock = productStock;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getShopId() {
    return shopId;
  }

  public void setShopId(long shopId) {
    this.shopId = shopId;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

}
