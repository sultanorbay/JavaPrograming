package day05_Concatenation;

import jdk.swing.interop.SwingInterOpUtils;

public class ShippingAddress {
    public static void main(String[] args) {
/*...*/


String name = "James King",
       buildingNumber = "11821B",
       streetName = "Jones Branch Dr",
       city = "McLean",
       state = "VA",
       zipCode = "22031A";


  /*


        String name = "James King";
String buildingNumber = "11821B";
String streetName = "Jones Branch Dr";
String city = "McLean";
String state = "VA";
String zipCode = "22031A";

*/
 //       System.out.println( name + " \n " + buildingNumber + " " +  streetName + "\n" + city + " , " + state + " " + zipCode );

String address = name + " \n " + buildingNumber + " " + " " + streetName + " \n " + city + " , " + state + " " + zipCode;
        System.out.println(address);





    }
}
