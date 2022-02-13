package com.source.mavenexample;

import org.springframework.stereotype.Component;

@Component("bikeBean")
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("I'm Riding Bike");
	}

}
