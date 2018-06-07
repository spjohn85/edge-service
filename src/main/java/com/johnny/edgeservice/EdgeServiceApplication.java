package com.johnny.edgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class EdgeServiceApplication {

	/*@Bean
	DiscoveryClientRouteDefinitionLocator discoveryRoutes(DiscoveryClient discoveryClient){
		return new DiscoveryClientRouteDefinitionLocator(discoveryClient);
	}*/
	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}
}
