package org.gfg;

public class JavaMain {
    //java
    public static void main(String[] args) {
        //tightly couply
        Student student = new Student("John");
        Student student1 = new Student("david");
        System.out.println(student1);
        System.out.println(student);
        Student student2 = new Student();
        student2.setName("John");
        student2.setAddress(new Address("city", "state", 12987));
        //constructor
        //depenency injection-> nothing to do with spring -> design pattern -> object

        //spring took all the responsibilities of injecting dependencies
        // ioc -> inversion of control -> control was with the developer / in hand of spring
//        how spring is doing this?

    }
}

//object -> obj name, properties , behaviors -> calling method
// bean -> id , properties