package com.codesigne.config;


import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


public class CodesigneConfig implements WebMvcConfigurer {



    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver  resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
//        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

//    @Bean
//    public DriverManagerDataSource getDataSource() {
//        DriverManagerDataSource bds = new DriverManagerDataSource();
//        bds.setDriverClassName(env.getProperty("ds.database-driver"));
//        bds.setUrl(env.getProperty("ds.url"));
//        bds.setUsername(env.getProperty("ds.username"));
//        bds.setPassword(env.getProperty("ds.password"));
//        return bds;
//    }

 




}
