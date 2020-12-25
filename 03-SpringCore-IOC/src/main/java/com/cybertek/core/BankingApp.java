package com.cybertek.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybertek.interfaces.BankingService;

/**
 * Hello world!
 *
 */
public class BankingApp 
{
    public static void main( String[] args )
    {
       /*
    	//BeanFactory Definition
    	Resource res=new ClassPathResource("beans.xml");
    	BeanFactory bf =new XmlBeanFactory(res);
    	
    	BankingServiceDomestic bsd=bf.getBean("bankingServiceDomestic",BankingServiceDomestic.class);
    	
    	bsd.createAccount();
    	
    	//Application Factory Definition
    	
    	 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	 
    	 BankingServiceInternational bsd2=context.getBean("bankingServiceInternational",BankingServiceInternational.class);
    	 bsd2.createAccount();
    	 
    	*/
    	
    	AbstractApplicationContext  context=new ClassPathXmlApplicationContext("beans.xml");
    	 
    	 BankingService bsd2=context.getBean("bankingService",BankingService.class);
    	 bsd2.createAccount();
    	
    	 //close the app context 
    	 
    	// context.registerShutdownHook();
    }
}
