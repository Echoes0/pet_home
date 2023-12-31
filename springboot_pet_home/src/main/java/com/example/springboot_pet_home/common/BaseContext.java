package com.example.springboot_pet_home.common;

/**
 * 基于ThreadLocal封装的工具类，用于保存和获取当前登录用户的id
 * 线程隔离
 */
public class BaseContext {
    private static ThreadLocal<Long>  threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
