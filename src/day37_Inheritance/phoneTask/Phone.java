package day37_Inheritance.phoneTask;

public class Phone {  // parent class: only contains common features of all ...

    public  String brand;
    public String model;
    public String size;
    public  double price;
    public String color;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
    System.out.println(brand+ " "+model +" is texting "+phoneNumber);
}

    public void text(long phoneNumber){
    System.out.println(brand + " " +model+" is texting " + phoneNumber);
}

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }




}
