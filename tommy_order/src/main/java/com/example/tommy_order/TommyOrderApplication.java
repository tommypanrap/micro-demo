package com.example.tommy_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TommyOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TommyOrderApplication.class, args);
	}

}
