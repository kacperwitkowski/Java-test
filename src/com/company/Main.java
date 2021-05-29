package com.company;
import devices.Car;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("rasowy",4.0);
        cat.name = "Mruczek";

      Car audi = new Car("A4","Audi",8000.0);
        audi.color = "black";
        audi.transmission = "manual";
        Human person = new Human();
        person.firstName = "Janusz";
        person.lastName = "Kowalski";
        person.pet = cat;

        person.setSalary(11100.0);
        person.getSalary();

        Car audi2 = new Car("A4","Audi",8000.0);
        audi2.color = "black";
        audi2.transmission = "manual";

        Car mercedes = new Car("C klasa","Mercedes",90000.0);
        mercedes.color = "white";
        mercedes.transmission = "automatic";

        System.out.println(cat);

        person.setCar(audi);

        if(audi.equals(audi2)) System.out.println("rowne sa");


//        if(audi.equals(mercedes)) System.out.println("nie sa rowne");

        System.out.println(audi);
        System.out.println(audi2);




    }
}
