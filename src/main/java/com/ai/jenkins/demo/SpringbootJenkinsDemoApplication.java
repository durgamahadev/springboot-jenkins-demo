package com.ai.jenkins.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringbootJenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
    }

   /* @Bean
    public InternalResourceViewResolver getViewResolver() {
        return new InternalResourceViewResolver("resources/templates/html/", ".html");
    }*/
}
