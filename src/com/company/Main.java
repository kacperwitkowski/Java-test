package com.company;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("rasowy",4.0);
        cat.name = "Mruczek";

        Car audi = new Car("Audi","A4");
        audi.color = "black";
        audi.transmission = "manual";
        audi.value = 8000.0;
        Human person = new Human();
        person.firstName = "Janusz";
        person.lastName = "Kowalski";
        person.pet = cat;

        person.setSalary(11100.0);
        person.getSalary();


        person.setCar(audi);
        person.getCar();


    }
}
