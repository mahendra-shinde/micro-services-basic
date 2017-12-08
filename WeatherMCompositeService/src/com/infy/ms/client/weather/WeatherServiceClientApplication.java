package com.infy.ms.client.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class WeatherServiceClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherServiceClientApplication.class, args);
	}
}
