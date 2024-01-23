package com.project.PropertyFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.PropertyFile.model.TestDataA;
import com.project.PropertyFile.model.TestDataAppProp;
import com.project.PropertyFile.model.TestDataB;

@SpringBootApplication
public class PropertyFileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PropertyFileApplication.class, args);
		TestDataA tA = ctx.getBean(TestDataA.class);
		System.out.println(tA.getUsername());
		TestDataB tB = ctx.getBean(TestDataB.class);
		System.out.println(tB.getUsername());

		TestDataAppProp testDataAppProp = ctx.getBean(TestDataAppProp.class);
		System.out.println(tB.getUsername());

	}

}
