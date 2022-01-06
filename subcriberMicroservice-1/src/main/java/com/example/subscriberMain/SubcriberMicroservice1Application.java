package com.example.subscriberMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SubcriberMicroservice1Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(SubcriberMicroservice1Application.class, args);
			
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplete() 
	{
		return new RestTemplate();
	}
}
