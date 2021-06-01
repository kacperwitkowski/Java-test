package com.company.devices;
import com.company.Human;
import com.company.Salleable;
import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

public class Phone extends Device implements Salleable {
    final String producer;
    final String model;
    final Double screenSize;
    final String operatingSystem;

    static final String DEFAULT_SERVER = "localhost:3000";
    static final String DEFAULT_PROTOCOL = "HTTP";
    static final String DEFAULT_VERSION = "1.0.0";


    public Phone(String producer, String model, Double screenSize, String operatingSystem,int yearOfProduction,Double value) {
        super(producer, model, yearOfProduction,value);
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

    public void installAnApp(String name) {
        this.installAnApp(name, DEFAULT_VERSION);
    }

    public void installAnApp(String name, String version) {
        this.installAnApp(name, version, DEFAULT_SERVER);
    }

    public void installAnApp(String name, String version, String serverAddress) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, serverAddress, name + " " + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url) {
        System.out.println("Pobieranie aplikacji " + url.getFile());

    }

    public void installAnApp(List<String> appNames) {
        String[] appArray = new String[appNames.size()];
        appArray = appNames.toArray(appArray);

        this.installAnApp(appArray);
    }

    public void installAnApp(String[] applications) {
        for (String appName: applications) {
            this.installAnApp(appName);
        }
    }



}