package com.company;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("rasowy",4.0);
        cat.name = "Mruczek";

        Car audi = new Car("Audi","A4");
        audi.color = "black";
        audi.transmission = "manual";


        Human person = new Human();
        person.firstName = "Janusz";
        person.lastName = "Kowalski";
        person.pet = cat;
        person.car = audi;

    }
}
