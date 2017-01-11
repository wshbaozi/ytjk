package com.ytjk.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/1/11.
 */
@Configuration
public class CorsConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override public void addCorsMappings(CorsRegistry registry) { registry.addMapping("/doctor/*").allowedOrigins("*");
    }
}