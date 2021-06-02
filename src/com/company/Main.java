package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.*;
import com.company.creatures.FarmAnimal;


public class Main {
    public static void main(String[] args) throws Exception {


      Animal dog = new Pet("Cziłała",6.0,"Ator");
      FarmAnimal cow = new FarmAnimal("Brunatna",250.0,"Kasia");


        Human person = new Human("Janusz","Kowalski");
        person.pet = dog;

        Human person2 = new Human("Julia","Kościuszko");

        Car tesla = new Electric("Tesla","1234",2017,80000.0,person);
        tesla.color = "black";
        tesla.transmission = "manual";


        Car mercedes = new Diesel("Mercedes","C klasa",2012,150000.0,person);
        mercedes.color = "white";
        mercedes.transmission = "automatic";

        Car audi = new LPG("Audi","A4",2003,3000.0,person2);
        audi.transmission = "manual";
        audi.color = "red";

        person.setSalary(1000000.0);
        person.getSalary();

        tesla.refuel();

        person.cash = 500.0;
        person2.cash = 1000.0;


      System.out.println("mercedes ilość transakcji: " + mercedes.carTransactions());
      mercedes.sell(person,person2,1000.0);
      System.out.println("mercedes ilość transakcji: " + mercedes.carTransactions());
      System.out.println("Czy byl kiedykolwiek sprzedawca? " + mercedes.hasBeenSeller(person,person2));
      System.out.println("Czy bylo sprzedane od person1 do person2? " + mercedes.soldFromTo(person2,person));
      System.out.println("Był kiedykolwiek wlascicielem tesli? " + tesla.hasBeenOwner(person2));
      mercedes.sell(person2,person,660.0);
      System.out.println("mercedes ilość transakcji: " + mercedes.carTransactions());



        Phone phone = new Phone("Apple","Iphone X",6.2,"IOS",2017,1500.0);
        person.mobilePhone = phone;

        Application facebook = new Application("Facebook","10.1.1",0.0);
        Application messeneger = new Application("Messeneger","6.2.5",10.0);
        Application snapchat = new Application("Snapchat","11.3.2",34.0);

        phone.installAnApp(person,facebook);
        phone.installAnApp(person,messeneger);
        phone.installAnApp(person,snapchat);

        System.out.println(phone.isAppInstalled(facebook));
        phone.allFreeApps();
        System.out.println(phone.valueOfApps());
    }
}
