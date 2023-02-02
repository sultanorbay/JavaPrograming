package day46_Polymorphism;

import day43_Abstraction.employee.*;
import day44_Abstraction.Animal;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shape.*;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1=2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[]  array={str, n1, n2, r1, new Circle(4), new Square(7)};

        /*

        WebDriver driver;

        driver = new ChromeDriver();
        driver = new FireFoxDriver();


         */


        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Employee>  cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println("-----------------------------------------");


          Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
          employee.work();
         // employee.bugReport();

        /*

        WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        driver1.get(amazon);
        driver1.get(google);


        Animal animal = new Dog();
        animal.drink()


         */

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
          animal.drink();
          animal.eat();
         // animal.play();
         // animal.bark();

        Playable animal2 = new Dog("Max", "Husky", 'M',3, "Small","Black");
        System.out.println(animal2.isFriendly);
        animal2.play();

        //animal2.drink();
        // animal2.eat();
             Shape shape= new Circle(5);
             shape.area();

     //   System.out.println(shape.getRadius());
      //  System.out.println( shape.PI);

        boolean isSquare  = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof  Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);





    }
}
