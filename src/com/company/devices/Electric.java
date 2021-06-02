package com.company.devices;


import com.company.Human;

public class Electric extends Car {

    public Electric(String producer, String model, Integer yearOfProduction, Double value, Human owner) {
        super(producer,model,yearOfProduction,value,owner);
    }

    public void refuel() {
        System.out.println("Auto zostało zatankowane");
    }

}
