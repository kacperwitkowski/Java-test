package com.company.devices;

public abstract class Device {
    public final String producer;
    public final String model;
    public final int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }


//    public void turnOn() {
//        System.out.println("Włącza się");
//    }

     public abstract void turnOn();
}
