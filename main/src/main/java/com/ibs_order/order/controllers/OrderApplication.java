package com.ibs_order.order.controllers;

import com.ibs_order.order.config.SpringConfig;
import com.ibs_order.order.services.TestBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OrderApplication
{

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		TestBean bean = context.getBean(TestBean.class);

		System.out.println(bean.getName());


		//SpringApplication.run(OrderApplication.class, args);

	}

}

