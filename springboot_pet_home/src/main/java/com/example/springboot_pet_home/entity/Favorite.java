package com.example.springboot_pet_home.entity;


public class Favorite {

  private long favoriteId;
  private String userAccount;
  private long shopId;


  public long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(long favoriteId) {
    this.favoriteId = favoriteId;
  }


  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }


  public long getShopId() {
    return shopId;
  }

  public void setShopId(long shopId) {
    this.shopId = shopId;
  }

}
