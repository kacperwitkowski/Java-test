package com.company.devices;


public class Electric extends Car {

    public Electric(String producer, String model,Double value, Integer yearOfProduction) {
        super(producer,model,value,yearOfProduction);
    }

    public void refuel() {
        System.out.println("Auto zostało zatankowane");
    }

}
