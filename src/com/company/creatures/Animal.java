package com.company.creatures;


import com.company.Human;
import com.company.Salleable;

public abstract class Animal implements Salleable, Edbile, Feedable {
    public String name;
    public String species;
    public Double weight; //private?



    public Animal(String species,Double weight,String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    public void feed() {
        try {
            if (this.weight <= 0.0) {
                throw new Exception(this.name + " nie żyje.");
            } else {
                this.weight ++;
                System.out.println(this.name + " zostało nakarmione.");
            }

        } catch (Exception feedEx) {
            System.err.println(feedEx);
        }
    }


    @Override
    public void feed(double foodWeight) {
        try {
            if (this.weight <= 0.0) {
                throw new Exception(this.name + " nie może jeść, bo nie żyje.");
            } else {
                this.weight += foodWeight;
                System.out.println(this.name + " został nakarmiony. " + foodWeight);
            }

        } catch (Exception feedEx) {
            System.err.println(feedEx);
        }
    }



    public void takeForAWalk() {
        try {
            if (this.weight == 0.0) {
                throw new Exception(this.name + " już nie żyje.");
            } else {
                System.out.println(this.name + " zostało wyprowadzony na spacer.");
                if (this.weight <= 1.0) {
                    this.weight = 0.0;
                    System.out.println(this.name + " za bardzo schudł i umarł.");
                } else {
                    this.weight --;
                }
            }
        } catch (Exception walkEx) {
            System.err.println(walkEx);
        }
    }

    public String toString() {
        return name+" "+species+" "+weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if (seller.pet != this){
            System.out.println("Nie możesz sprzedać nie swojego zwierzaka");
            return;
        }
        else if (buyer.cash < price){
            System.out.println("Nie masz wystarczająco pieniędzy");
            return;
        }
        else if (seller == buyer){
            System.out.println("Nie możesz sprzedać sam sobie zwierzęcia");
            return;
        }
        buyer.cash -=price;
        seller.cash += price;
        buyer.pet = seller.pet;
        seller.pet = null;
        System.out.println("Udało się sprzedać zwierzę za " + price + "!");


    }
}
