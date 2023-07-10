package com.example.springboot_pet_home.entity;


public class Notification {

  private long notificationId;
  private String notificationContent;
  private String senderAccount;
  private String receiverAccount;


  public long getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(long notificationId) {
    this.notificationId = notificationId;
  }


  public String getNotificationContent() {
    return notificationContent;
  }

  public void setNotificationContent(String notificationContent) {
    this.notificationContent = notificationContent;
  }


  public String getSenderAccount() {
    return senderAccount;
  }

  public void setSenderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
  }


  public String getReceiverAccount() {
    return receiverAccount;
  }

  public void setReceiverAccount(String receiverAccount) {
    this.receiverAccount = receiverAccount;
  }

}
