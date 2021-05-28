package com.company;


public class Animal {
    public String name;
    final public String species;
    Double weight;



    public Animal(String species, Double weight){
        this.species = species;
        this.weight = weight;
    }

    void feed() {
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

    void takeForAWalk() {
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
}
