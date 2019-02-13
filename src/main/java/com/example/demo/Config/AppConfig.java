//package com.example.demo.Config;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import javax.activation.DataSource;
//import java.lang.Object;
//import  org.springframework.jdbc.datasource.AbstractDataSource;
//
//@Configuration
//@ComponentScan
//public class AppConfig  {
//    @Bean
//    public DataSource dataSource() {
//
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName(postgresql.jdbc.driver.OracleDriver.class.getName());
//        ds.setUrl("jdbc:postgresql://35.190.193.191:5432/postgres");
//        ds.setUsername("postgres");
//        ds.setPassword("Passw0rd!");
//        return ds;
//    }
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//        context.getBean(PersonClient.class).process();
//    }
//}