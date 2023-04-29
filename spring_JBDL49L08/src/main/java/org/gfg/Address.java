package org.gfg;

public class Address {

    String city;

    String state;

    int pincode;

    public Address() {
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
    public void initMethodName(){
        System.out.println("I will be called just before the bean is ready to use");
    }

    public void destroyMethodName(){
        System.out.println("I will be called just before the bean is getting destroyed");
    }
}
