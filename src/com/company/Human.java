package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Human implements Salleable {
    public Animal pet;
    public String firstName;
    public String lastName;
    public Phone mobilePhone;
    public Car[] garage;
    private Integer CarNumbers;
    private Double salary;
    public Double cash;



    public Human(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[3];
    }

    public Human(String firstName,String lastName,Pet pet,Phone phone,int CarNumbers){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.mobilePhone = phone;
        this.garage = new Car[CarNumbers];
    }

    public Car getCar(int ID) {
        return garage[ID];
    }

    public void setCar(Car car,int ID) {
        if (this.salary > car.value) {
            System.out.println("Kupiony za gotówkę");
            garage[ID] = car;
        } else if (car == null) {
            System.out.println("Samochód niedostępny");
            garage[ID] = car;
        } else if (this.salary > (car.value/12)) {
            System.out.println("Wzięty na kredyt");
            garage[ID] = car;
        } else
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }


    public List<Car> sortCars(){
        return Arrays.stream(garage)
                .sorted(Comparator.comparing(car -> car.yearOfProduction))
                .collect(Collectors.toList());
    }

    public double getValue(){
        double value = 0.0;
        for(int i = 0;i < garage.length;i++) {
            if (this.garage[i] != null) {
                value = value + this.garage[i].value;
            }
        }
        return value;
    }


    public void addCar(Car newCar){
        for (int i =0; i < this.garage.length;i++){
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                return;
            }
        }
    }

    public void removeCar(Car car){
        for (int i =0; i < this.garage.length;i++){
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public boolean freeSpace(){
        for (Car car : this.garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCar(Car car){
        for (Car value : this.garage) {
            if (value == car) {
                return true;
            }
        }
        return false;
    }


    public Double getSalary() {
        System.out.println("Wartość wypłaty: " + this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) throws Exception {
        if (salary <= 0) throw new Exception();
            System.out.println("" + firstName + " " + lastName + ": " + salary);
            System.out.println("Dane zostały wysłane do systemu księgowego.");
            System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr.");
            System.out.println("ZUS i US już o wszystkim wiedzą, nie ma sensu ukrywać dochodu.");

        this.salary = salary;
    }



public String toString() {
        return firstName+" "+lastName+" "+ pet +" "+ salary+" "+mobilePhone+" " + cash;
}
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Handel ludźmi jest niedozwolony!!!");
    }
}
