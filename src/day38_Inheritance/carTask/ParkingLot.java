package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota= new Toyota("Camry",2020,20000,"Gray", 1656);

        Tesla tesla=new Tesla("S",2022,26565,"Red",0);

        BMW bmw=new BMW("X5",2020,465626,"White",45);

        toyota.start();
        tesla.start();
        bmw.start();



    }
}
