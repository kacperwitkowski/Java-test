package com.company.devices;
import com.company.Human;
import com.company.Salleable;
import java.util.*;

public class Phone extends Device implements Salleable {
    final String producer;
    final String model;
    final Double screenSize;
    String operatingSystem;
    HashSet<Application> applications;


    public Phone(String producer, String model, Double screenSize, String operatingSystem,int yearOfProduction,Double value) {
        super(producer, model, yearOfProduction,value);
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.applications = new HashSet<Application>();
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


    public void installAnApp(Human buyer, Application application) throws Exception {
        if (buyer.cash < application.price) {
       throw new Exception("Nie masz wystarczajaco pieniedzy");
        } else {
            buyer.cash -= application.price;
            applications.add(application);
        }
    }

    public boolean isAppInstalled(Application application){
        return isAppInstalled(application.name);
    }

    public boolean isAppInstalled(String applicationName) {
        for (Application app : applications) {
            if (app.name.equals(applicationName)) {
                return true;
            }
        }
        return false;
    }

    public void allFreeApps() {
        for (Application application : applications){
            if (application.price ==0){
                System.out.println(application.name);
            }
        }
    }

    public double valueOfApps() {
        Double value = 0.0;
        for (Application application:applications) {
            value += application.price;
        }
        return value;
    }

}