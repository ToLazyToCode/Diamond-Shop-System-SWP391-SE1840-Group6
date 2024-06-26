package com.anhntv.diamondshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class DiamondshopApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiamondshopApplication.class, args);
	}

}
