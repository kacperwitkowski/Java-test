package com.company.creatures;

public class Pet extends Animal{
    public Pet(String species, Double weight,String name){
        super(species,weight,name);
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public void beEaten() {
        System.out.println("Pyszne żarcie");
    }
}