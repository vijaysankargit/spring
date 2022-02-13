package com.source.mavenexample;

import org.springframework.stereotype.Component;

//@Component is used to create a bean for the class without using the @bean method in the AppConfig file.
//@Component("mobileProcessor")
public interface MobileProcessor {


	void process();
}
