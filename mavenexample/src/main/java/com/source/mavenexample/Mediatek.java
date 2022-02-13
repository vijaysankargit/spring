package com.source.mavenexample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//If Two beans are present for the same Class,then @Primary is used to give priority to a particular bean
@Primary
public class Mediatek implements MobileProcessor {
	public void process() {
		System.out.println("2nd Best of All");
	}
}
