package com.company.devices;


public class LPG extends Car {

    public LPG(String producer, String model,Double value, Integer yearOfProduction) {
        super(producer,model,value,yearOfProduction);
    }

    public void refuel() {
        System.out.println("Auto zostało zatankowane");
    }

}
