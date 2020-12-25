package com.cybertek.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Resource res = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		BankingService bs=(BankingService) factory.getBean("bankingService");
		bs.accountCreate();
		

	}
}
