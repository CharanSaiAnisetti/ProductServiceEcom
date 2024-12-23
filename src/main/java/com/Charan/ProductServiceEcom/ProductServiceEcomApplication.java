package com.Charan.ProductServiceEcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.Charan.ProductServiceEcom.Repository")
public class ProductServiceEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceEcomApplication.class, args);
	}

}
