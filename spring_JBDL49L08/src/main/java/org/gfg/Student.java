package org.gfg;

public class Student {
    String name;

    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name){
        this.name =name;
        // dependency injection -> bad way
        this.address = new Address("city1" , "state1" ,12000);
    }

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public  Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
