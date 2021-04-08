package com.hackernews;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication(scanBasePackages = "com.hackernews")
@EnableCaching
public class HackerNewsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackerNewsApiApplication.class, args);

	}

}
