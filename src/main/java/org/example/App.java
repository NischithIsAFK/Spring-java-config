package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Creating the object
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
    	Alien obj = (Alien) context.getBean("alien");//Getting the object
//        Alien obj1 = (Alien) context.getBean("alien1");
        obj.code();

//        Alien obj2 = (Alien) context.getBean("alien1");
//        obj2.code();
    }
}
