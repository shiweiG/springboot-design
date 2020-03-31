package com.example.springbootjpadesign;

import com.example.springbootjpadesign.Repository.Impl.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
@SpringBootApplication
public class SpringbootJpaDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaDesignApplication.class, args);
    }

}
