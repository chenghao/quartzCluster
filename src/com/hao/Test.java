package com.hao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(new String[] { "classpath:config/spring/spring-dataSource.xml",
				"classpath:config/spring/spring-quartz.xml" });
	}

}
