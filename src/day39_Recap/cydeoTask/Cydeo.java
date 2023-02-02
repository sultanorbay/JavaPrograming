package day39_Recap.cydeoTask;

import jdk.swing.interop.SwingInterOpUtils;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer=new Developer("Korkmaz",25, 'M',1,"Java Developer", 1314585);
        Tester tester= new Tester("Olga", 27, 'F',2,"SDET",126565);
        Teacher teacher= new Teacher("Daniel",32, 'M',3, "Math Teacher",98645);

        Student student= new Student("Suhaib", 60, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("---------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("------------------");
        developer.work();
        tester.work();
        teacher.work();

        System.out.println("----------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

       tester.createTicket();

        teacher.eat();
        teacher.drink();
        teacher.sleep();


    }
}
