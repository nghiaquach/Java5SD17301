package com.fpoly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BeanConfig {
    @SessionScope
    @Bean("card")
    public ShoppingCard getShoppingCart() {
        return new ShoppingCard();
    }
}
