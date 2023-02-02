package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

// age: 38 years old
   byte age = 38;
// weight: 160 pounds
     // byte weight = 160; // 160 is out of "byte" range
 //byte num = -129; // -129 is out of "byte range"

short weight = 160; // 160 is within " the range of short"
//salary: 100000 $
//short salary = 100000; // 100000 is out of "short range"
int salary = 100000; // int is preferred data type for integar numbers

long asset = 3_333_333_333L;


//tax = 0.26
        float tax = 0.26F;

        double PI = 3.14;

// #
char ch1 = '#';
        System.out.println("ch1 = " + ch1);
char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

char gender = 'F';
char grade = 'F';
char yesNo = 'Y';
// char ch5 = 'AB'; is wrong, need to be single character
boolean isEmployed = true;
boolean isMarried = false;
boolean result = 100>300;
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city= "Mclean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);
        System.out.println("name = " + name);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

    }


}
