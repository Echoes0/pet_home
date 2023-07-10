package com.example.springboot_pet_home.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

  @TableId(type = IdType.AUTO)
  private Long account;
  private String password;
  private int type;
  private String nickname;
  private String phone;
  private String email;
  private String avatar;
  private String introduction;
  private String gender;
  private String signature;
  private String idCard;
  private String name;
  private String status;



}
