package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("rasowy",4.0);
        cat.name = "Mruczek";

      Car audi = new Car("A4","Audi",8000.0,2004);
        audi.color = "black";
        audi.transmission = "manual";

        Human person = new Human();
        person.firstName = "Janusz";
        person.lastName = "Kowalski";
        person.pet = cat;

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

        person.mobilePhone.sell(person,person2,300.0);

        cat.sell(person,person2,200.0);
        System.out.println("Zwierze person1: " + person.pet);
        System.out.println("Zwierze person2: " + person2.pet);
        System.out.println("Kasa person1: " + person.cash);
        System.out.println("Kasa person2: " + person2.cash);

        person.sell(person,person2,10.0);



    }
}
