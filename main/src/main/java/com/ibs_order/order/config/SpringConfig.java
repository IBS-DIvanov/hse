package com.ibs_order.order.config;

import com.ibs_order.order.services.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public TestBean getTestBean(){
        return new TestBean("Hello Spring");
    }
}
