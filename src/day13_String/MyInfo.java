package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in); // enter enter

        System.out.println("Enter your age:");
       int age =scan.nextInt();  // 19 enter

        System.out.println("Enter your gender:");
        String gender= scan.next(); // male enter

        scan.nextLine(); // enter enter

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine(); // if the previous scanner method that is used is not nextLine then  we need add nextLine method

        System.out.println("Enter your phone number");
        long phone = scan.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name:");
        String state = scan.next();

        System.out.println("Enter your building number:");
        int buildingNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name");

        String street = scan.nextLine();


        scan.close();

        System.out.println("fullName :" + fullName);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("phone : " + phone);
        System.out.println("Address: \n\t"  +buildingNum+" "+street +"\n\t"+city +", " +zipCode);
        System.out.println("schoolName :" + schoolName);
    }
}
