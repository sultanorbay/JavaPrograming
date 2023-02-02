package day44_Abstraction.animalTask;

import day44_Abstraction.Animal;

public final class Cat extends Animal implements Playable{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }



    @Override
    public void eat() {
        System.out.println(getName()+" is b...");
    }

       public void Meow(){
       System.out.println(getName()+ " is Meowing");

        }

public void play(){

}


}
