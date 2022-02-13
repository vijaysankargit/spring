package com.source.mavenexample;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	String brand;

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

	//Constructor Based Injection
	//	public Tyre(String brand) {
	//		super();
	//		this.brand = brand;
	//	}


	public String getBrand() {
		return brand;
	}

	//Setter Based Injection
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
