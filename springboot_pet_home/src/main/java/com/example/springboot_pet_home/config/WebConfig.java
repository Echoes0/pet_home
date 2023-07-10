package com.example.springboot_pet_home.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {


    /**
     * 配置跨域
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //跨域配置：前端是8080端口，后端是8888
        //要允许8080访问接口服务
        registry.addMapping("/**")
//                .allowedOrigins("http://*:*")
                .allowCredentials(true)
                .allowedMethods("GET","POST")
                .allowedOriginPatterns("*")
                .maxAge(3600)
        ;
    }

}

