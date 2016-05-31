package com.ngracia.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Nestor Gracia on 01/06/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ngracia.spring")
public class AppConfig {

    @Bean
    public ViewResolver viewResolver(){
        throw new NotImplementedException();
    }
}
