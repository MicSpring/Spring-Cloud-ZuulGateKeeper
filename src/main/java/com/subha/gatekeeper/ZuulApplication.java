package com.subha.gatekeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableZuulProxy
@Controller
public class ZuulApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ZuulApplication.class, args);
		//new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);

	}

}
