package com.example.productrecommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductRecommendationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRecommendationApplication.class, args);
	}

}
