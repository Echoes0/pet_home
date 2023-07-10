package com.example.springboot_pet_home.entity;


public class Recommendation {

  private String recommendationType;
  private long recommendationId;
  private long recommendationClassId;


  public String getRecommendationType() {
    return recommendationType;
  }

  public void setRecommendationType(String recommendationType) {
    this.recommendationType = recommendationType;
  }


  public long getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(long recommendationId) {
    this.recommendationId = recommendationId;
  }


  public long getRecommendationClassId() {
    return recommendationClassId;
  }

  public void setRecommendationClassId(long recommendationClassId) {
    this.recommendationClassId = recommendationClassId;
  }

}
