package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

      Dog dog=new Dog();
      dog.setInfo("Max", "Husky", 'M', 2, "Small", "white");
      dog.eat();
      dog.drink();
      dog.sleep();
      dog.move();
      dog.bark();
        System.out.println(dog);


      Cat cat = new Cat();
      cat.setInfo("Tarcin", "British", 'M', 2,"Small", "Black");

       cat.eat();
       cat.sleep();
       cat.drink();
       cat.move();
       cat.scratch();
       System.out.println(cat);


      Tiger tiger = new Tiger();
      tiger.setInfo("Sher","Bengal",'M',4, "Large", "Red");

    tiger.eat();
    tiger.sleep();
    tiger.drink();
    tiger.move();
    tiger.roar();
    tiger.hunt();
        System.out.println(tiger);




    }
}
