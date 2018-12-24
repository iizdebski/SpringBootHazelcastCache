package com.izdebski.SpringBootCache;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootInfinispanCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInfinispanCacheApplication.class, args);

	}
}