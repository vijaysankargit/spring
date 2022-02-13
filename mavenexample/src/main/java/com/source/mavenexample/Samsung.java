package com.source.mavenexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component is used to create a bean for the class without using the @bean method in the AppConfig file.
//@Component("samsung")
public class Samsung {

	@Autowired
	//	@Qualifier("snapdragon")
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	void config() {
		System.out.println("8 gb RAM, High Processor");
		cpu.process();
	}
}
