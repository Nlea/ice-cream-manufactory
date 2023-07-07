package com.nlea.observability.demo;

import com.autometrics.bindings.EnableAutometrics;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutometrics

public class IceCreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceCreamApplication.class, args);
	}

}
