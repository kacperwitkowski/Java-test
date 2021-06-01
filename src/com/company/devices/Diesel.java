package com.company.devices;


public class Diesel extends Car {


    public Diesel(String producer, String model, Integer yearOfProduction,Double value) {
        super(producer,model,yearOfProduction,value);
    }

    public void refuel() {
        System.out.println("Auto zostało zatankowane");
    }
}
