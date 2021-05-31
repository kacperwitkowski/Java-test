package com.company.creatures;

public class FarmAnimal extends Animal{
    public FarmAnimal (String species, Double weight,String name){
        super(species,weight,name);
    }



    @Override
    public void beEaten() {
        System.out.println("Pyszne żarcie");
    }
}
