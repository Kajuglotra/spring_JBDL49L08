package org.gfg;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo {
    public static void main(String[] args) {

        // this is only one way
        // 1 way of creating bean factory
        Resource resource = new ClassPathResource("projectbean.xml");
        // memory -> space which will get used by this factory
        //refernce of foctory address
        BeanFactory factory = new XmlBeanFactory(resource); // container/bucket
        Address address = (Address) factory.getBean("address1");
        //new different object in every case
        Address address2 = (Address) factory.getBean("address1");
        //new http request, then i will have a new object

        // 1 http request was in place -> life of http request we had the same object
        System.out.println(address.equals(address2));


    }
}
