package com.example.springboot_pet_home.unity;

import java.util.Random;

import static java.lang.Long.parseLong;

public class Unity{

    public static int RandomCode(String phone){

        //以手机号作为种子生成随机数
        Random random = new Random(parseLong(phone));

        //生成四位随机数
        return (1000+random.nextInt(999)*(9000));
    }
}
