package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human{
    Animal pet;
    String firstName;
    String lastName;
    Phone mobilePhone;
    Car car;
    private Double salary;

    public double getSalary() {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
        LocalDateTime curr = LocalDateTime.now();
        System.out.println(this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Nie da się zarabiać poniżej 0zł!");
        } else {
            System.out.println("" + firstName + " " + lastName + ": " + salary);
            System.out.println("Dane zostały wysłane do systemu księgowego.");
            System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr.");
            System.out.println("ZUS i US już o wszystkim wiedzą, nie ma sensu ukrywać dochodu.");
        }
        this.salary = salary;
    }


}
