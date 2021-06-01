package com.company.devices;
import java.util.Objects;
import com.company.Human;
import com.company.Salleable;

public  abstract class Car extends Device implements Salleable {

public final String producer;
public final String model;
public String color;
public String transmission;
public Double value;

    public Car(String model, String producer, int yearOfProduction, double value){
        super(model,producer,yearOfProduction,value);
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return transmission == car.transmission &&
                Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                color == car.color &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, color, transmission, value);
    }



    @Override
    public void turnOn() {
        System.out.println("Auto włącza się.");
    }



@Override
    public String toString() {
        return value +" "+color+" "+transmission+" " + yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if (!seller.hasCar(this)){
           throw new Exception("Nie znalezionio auta na sprzedaż");
        }
        if (buyer.cash < price){
            throw new Exception("Nie masz wystarczająco pieniędzy");
        }
        if (seller == buyer){
            throw new Exception("Nie możesz sprzedać sam sobie auta");
        }
        buyer.cash -=price;
        seller.cash += price;
        buyer.addCar(this);
        seller.removeCar(this);
        System.out.println("udało się sprzedać samochód za "+price+ "!");


    }
public abstract void refuel();

}