package com.company.devices;


public class LPG extends Car {

    public LPG(String producer, String model, Integer yearOfProduction,double value) {
        super(producer,model, yearOfProduction,value);
    }

    public void refuel() {
        System.out.println("Auto zostało zatankowane");
    }

}
