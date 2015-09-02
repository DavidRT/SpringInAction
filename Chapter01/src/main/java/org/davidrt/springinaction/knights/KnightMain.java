package org.davidrt.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	
	public static void main(String[] args) throws Exception {
		
		/*  Context to load configuration from a xml file
	 	For a java-based, use AnnotationConfigApplicationContext */
	    ClassPathXmlApplicationContext context = 
	        new ClassPathXmlApplicationContext(
	            "META-INF/spring/knight.xml");
	    
	    
	    Knight knight = context.getBean(Knight.class);
	    knight.embarkOnQuest();
	    context.close();
	  }

}
