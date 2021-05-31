package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.FarmAnimal;

public class Main {
    public static void main(String[] args) throws Exception {


      Animal dog = new Pet("Cziłała",6.0,"Ator");
      FarmAnimal cow = new FarmAnimal("Brunatna",250.0,"Kasia");

      cow.beEaten();
      cow.feed();
      dog.takeForAWalk();
      dog.feed(10.0);
      System.out.println("Waga psa: " + dog.weight);
      System.out.println("Waga krowy: " + cow.weight);

      Car audi = new Car("A4","Audi",8000.0,2004);
        audi.color = "black";
        audi.transmission = "manual";

        Human person = new Human();
        person.firstName = "Janusz";
        person.lastName = "Kowalski";
        person.pet = dog;

        Human person2 = new Human();
        person2.firstName = "Julia";
        person2.lastName = "Kościuszko";


        Car mercedes = new Car("C klasa","Mercedes",90000.0,2012);
        mercedes.color = "white";
        mercedes.transmission = "automatic";

        person.setSalary(10000.0);
        person.getSalary();
        person.setCar(audi);

        person.cash = 500.0;
        person2.cash = 1000.0;

        person.getCar().sell(person,person2,20000.0);


        Phone phone = new Phone("Apple","Iphone X",6.2,"IOS",2017);
        person.mobilePhone = phone;


        System.out.println("Zwierze person1: " + person.pet);
        System.out.println("Zwierze person2: " + person2.pet);
        System.out.println("Kasa person1: " + person.cash);
        System.out.println("Kasa person2: " + person2.cash);




    }
}
