package com.company.devices;
import com.company.Human;
import com.company.Salleable;

public class Phone extends Device implements Salleable {
    final String producer;
    final String model;
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem,int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return producer+" "+model+" "+screenSize+" "+operatingSystem + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon włącza się");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if (seller.mobilePhone != this){
            System.out.println("Nie możesz sprzedać nie swojego telefonu");
            return;
        }
        if (buyer.cash < price){
            System.out.println("Kupujący nie ma wystarczająco pieniędzy");
            return;
        }
        if (seller == buyer){
            System.out.println("Nie możesz sprzedawać samemu sobie");
            return;
        }
        buyer.cash -=price;
        seller.cash += price;
        buyer.mobilePhone = seller.mobilePhone;
        seller.mobilePhone = null;
        System.out.println("Udało się sprzedać telefon za "+price);


    }
}