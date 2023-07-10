package com.example.springboot_pet_home.entity;


public class Activity {

  private long activityId;
  private String activityDescription;
  private long activityCoupon;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;


  public long getActivityId() {
    return activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }


  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }


  public long getActivityCoupon() {
    return activityCoupon;
  }

  public void setActivityCoupon(long activityCoupon) {
    this.activityCoupon = activityCoupon;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }

}
