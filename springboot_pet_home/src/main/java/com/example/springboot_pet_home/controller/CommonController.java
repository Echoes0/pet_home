package com.example.springboot_pet_home.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.springboot_pet_home.common.Result;
import com.example.springboot_pet_home.entity.User;
import com.example.springboot_pet_home.service.UserService;
import com.example.springboot_pet_home.unity.Unity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/common")
public class CommonController {

    //验证码
    private int Code=-1;

    @Autowired
    UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public Result<User> login(Long account, String password,int type) {

        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();

        //账号登录
        if (type==0){

            queryWrapper.eq(User::getAccount,account);
        }

        //手机号登录
        else{

            queryWrapper.eq(User::getPhone,account);
        }

        queryWrapper.eq(User::getPassword,password);

        User user = userService.getOne(queryWrapper);

        //未有匹配
        if (user==null){

            return Result.error("账号或密码错误");
        }

        return Result.success(user);
    }

    /**
     * 发送验证码
     * @param phone 手机号
     * @return 执行情况
     */
    @PostMapping("/sendCode")
    @ResponseBody
    public Result<String> sendCode(String phone) {

        //判断手机号是否已被注册
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();

        queryWrapper.eq(User::getPhone,phone);

        User user1 = userService.getOne(queryWrapper);

        if (user1!=null){

            return Result.error("该手机号已被注册");
        }

        //生成验证码
        Code= Unity.RandomCode(phone);
        return Result.success("验证码已发送");
    }

    /**
     * 用户注册
     * @param user 用户信息
     * @param type 用户类型
     * @param code 验证码
     * @return 用户信息
     */
    @PostMapping("/register")
    @ResponseBody
    public Result<User> register(@RequestBody User user, int type,int code) {

        user.setAccount(0L);

        if (code!=Code){

            return Result.error("验证码错误");
        }

        //商家注册
        if (type==1){

            user.setType(1);
        }

        //顾客注册
        else{

            user.setType(2);
        }

        userService.save(user);

        return Result.success(user);
    }
}
