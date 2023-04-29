package org.gfg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
    // runnable and thread class for creating a thread class
    public static void main(String[] args) {
        //extra functionalities ->
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("projectbean.xml");
        Address address = (Address) context.getBean("address1");
        System.out.println(address);
        context.close();
        // may be this is keeping the object
        System.out.println(address);
    }
}
