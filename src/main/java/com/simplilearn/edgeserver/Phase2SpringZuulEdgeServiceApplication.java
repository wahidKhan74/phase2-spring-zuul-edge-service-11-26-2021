package com.simplilearn.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Phase2SpringZuulEdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase2SpringZuulEdgeServiceApplication.class, args);
	}

}
