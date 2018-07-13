package vn.com.vuong.service.scheduling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import vn.com.vuong.configuration.AppConfig;

public class MainApp {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
