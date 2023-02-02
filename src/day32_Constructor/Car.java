package day32_Constructor;

public class Car {

    public String brand, model;
    public int year;
    public double price;
    public String color;

    public Car(String brand){
        this.brand  = brand;
    }

    public Car(String brand, String model){
        this(brand);
        this.model = model;

    }


    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
    }


    public Car(String brand, String model, int year, double price, String color) {
        this.brand= brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }























}
