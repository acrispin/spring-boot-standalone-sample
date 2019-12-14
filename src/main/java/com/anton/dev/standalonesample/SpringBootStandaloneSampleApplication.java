package com.anton.dev.standalonesample;

import com.anton.dev.standalonesample.bean.HelloWorldBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Anton
 * https://www.boraji.com/spring-boot-creating-a-standalone-application-example
 */
@SpringBootApplication
public class SpringBootStandaloneSampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootStandaloneSampleApplication.class, args);
		HelloWorldBean bean = ctx.getBean(HelloWorldBean.class);
		bean.sayHello();
	}

}
