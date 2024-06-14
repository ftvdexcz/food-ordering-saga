package com.food.ordering.system.order.service.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    // in domain service, not include spring annotation -> need to register as a bean to injectable
    @Bean
    public OrderDomainService orderDomainService(){
        return new OrderDomainServiceImpl();
    }


}
