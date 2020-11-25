package com.shopping.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import utils.IdWorker;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("com.shopping.goods.mapper")
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(0,1) ;
    }
}
