package com.company;
import devices.Car;
import devices.Phone;

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

        person.setSalary(11100.0);
        person.getSalary();

        Car audi2 = new Car("A4","Audi",8000.0,2004);
        audi2.color = "black";
        audi2.transmission = "manual";

        Car mercedes = new Car("C klasa","Mercedes",90000.0,2012);
        mercedes.color = "white";
        mercedes.transmission = "automatic";


        person.setCar(audi);


        audi.turnOn();
        System.out.println(audi);

        Phone phone = new Phone("Apple","Iphone X",6.2,"IOS",2017);
        phone.turnOn();

        System.out.println(phone);


    }
}
