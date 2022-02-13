package com.source.mavenexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = "com.source.mavenExample")
public class AppConfig {

	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}

	@Bean
	public MobileProcessor getMobileProcessor() {
		return new Snapdragon();
	}

}
