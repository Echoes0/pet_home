package com.example.springboot_pet_home.entity;


public class DeliveryInfo {

  private long infoId;
  private String userAccount;
  private String deliveryAddress;
  private String receiverName;
  private String receiverPhone;


  public long getInfoId() {
    return infoId;
  }

  public void setInfoId(long infoId) {
    this.infoId = infoId;
  }


  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }


  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }


  public String getReceiverPhone() {
    return receiverPhone;
  }

  public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
  }

}
