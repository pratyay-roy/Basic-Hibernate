package com.cts.main;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
@SpringBootApplication
@ComponentScan("com.cts")
@EntityScan(basePackages = {"com.cts.model"})
@EnableJpaRepositories(basePackages = "com.cts.repository")
public class SpringJpaEntityMappingsCustomerApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaEntityMappingsCustomerApplication.class, args);
    }
 
}
