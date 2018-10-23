package cn.lwkang.thymeleafandjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeleafandjpaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(ThymeleafandjpaApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(ThymeleafandjpaApplication.class, args);
    }
}
