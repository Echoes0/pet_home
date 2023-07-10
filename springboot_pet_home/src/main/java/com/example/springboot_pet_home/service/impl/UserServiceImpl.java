package com.example.springboot_pet_home.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_pet_home.entity.User;
import com.example.springboot_pet_home.mapper.UserMapper;
import com.example.springboot_pet_home.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
