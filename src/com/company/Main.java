package com.company;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("rasowy",4.0);
        cat.name = "Mruczek";

        Human person = new Human();
        person.firstName = "Janusz";
        person.lastName = "Kowalski";
        person.pet = cat;

        cat.feed();
        System.out.println(cat.name + " waży: " + cat.weight);
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();

        System.out.println(cat.name + " waży: " + cat.weight);
    }
}
