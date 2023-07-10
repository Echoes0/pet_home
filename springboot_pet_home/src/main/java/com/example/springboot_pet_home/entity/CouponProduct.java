package com.example.springboot_pet_home.entity;


public class CouponProduct {

  private long couponId;
  private long productId;


  public long getCouponId() {
    return couponId;
  }

  public void setCouponId(long couponId) {
    this.couponId = couponId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

}
