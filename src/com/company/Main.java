package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.Phone;
import com.company.creatures.FarmAnimal;
import java.util.ArrayList;
import java.util.List;

import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {


      Animal dog = new Pet("Cziłała",6.0,"Ator");
      FarmAnimal cow = new FarmAnimal("Brunatna",250.0,"Kasia");



      Car tesla = new Electric("Tesla","1234",80000.0,2017);
        tesla.color = "black";
        tesla.transmission = "manual";

        Human person = new Human();
        person.firstName = "Janusz";
        person.lastName = "Kowalski";
        person.pet = dog;

        Human person2 = new Human();
        person2.firstName = "Julia";
        person2.lastName = "Kościuszko";


        Car mercedes = new Diesel("C klasa","Mercedes",90000.0,2012);
        mercedes.color = "white";
        mercedes.transmission = "automatic";

        person.setSalary(10000.0);
        person.getSalary();
        person.setCar(tesla);

        tesla.refuel();

        person.getCar();

        person.cash = 500.0;
        person2.cash = 1000.0;

        person.getCar().sell(person,person2,20000.0);


        Phone phone = new Phone("Apple","Iphone X",6.2,"IOS",2017);
        person.mobilePhone = phone;

      phone.installAnApp("Facebook");
      phone.installAnApp("Facebook", "1.0.1");
      phone.installAnApp("Snapchat", "1.0.2", "snapchat.com");


      String[] appList = {"Facebook","Snapchat","Instagram","Messenger"};
      phone.installAnApp(appList);





    }
}
