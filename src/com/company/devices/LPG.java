package com.company.devices;


import com.company.Human;

public class LPG extends Car {

    public LPG(String producer, String model, Integer yearOfProduction, double value, Human owner) {
        super(producer,model, yearOfProduction,value,owner);
    }

    public void refuel() {
        System.out.println("Auto zostało zatankowane");
    }

}
