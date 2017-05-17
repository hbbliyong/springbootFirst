package com.ly.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Administrator on 2017/5/15.
 */
@Configuration
//@EnableWebMvc
public class WebMvcConfig  extends WebMvcConfigurerAdapter {

//    @Bean
//    public InternalResourceViewResolver viewResolver(){
//        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
//       // viewResolver.setPrefix("/classes/static/");
//        viewResolver.setSuffix(".html");
//      // viewResolver.setViewClass(JstlView.class);
//
//        return  viewResolver;
//    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").
//                addResourceLocations("classpath:/static/").setCachePeriod(604800);
//        super.addResourceHandlers(registry);
//
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/index").setViewName("/index");
//    }
}
