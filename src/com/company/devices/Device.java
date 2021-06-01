package com.company.devices;

public abstract class Device {
    public final String producer;
    public final String model;
    public int yearOfProduction;
    public Double value;

    public Device(String producer, String model, int yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }



     public abstract void turnOn();

}
