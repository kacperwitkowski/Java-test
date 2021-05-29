package devices;
import java.util.Objects;

public class Car extends Device{
public final String producer;
public final String model;
public String color;
public String transmission;
public Double value;

    public Car(String model,String producer,double value,int yearOfProduction){
        super(model,producer,yearOfProduction);
        this.model = model;
        this.producer = producer;
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
}