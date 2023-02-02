package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("cydeo", "school");  //C.S
        System.out.println("-----------------------------");

        domain("Cydeo.School@gmail.com");

        System.out.println("----------------------------");

        String[] emails={"josh@gmail.com", "Jım@yahoo.com", "Elminur@cydeo.com","Gulsen@gmail.com"};


        for (String email : emails) {
            domain(email);
        }

        System.out.println("---------------------------------");


       nameOfMonth( 11);








    }
    // create a method that can display the initials of the person. initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
        String initial= firstName.charAt(0)+"."+lastName.charAt(0);
        initial= initial.toUpperCase();
        System.out.println("initial = " + initial);
    }


   //Create a method that can display the domain of the email. domain(String email)

    public static void domain(String email){ //Cydeo.School@gmail.com
        String domain= email.substring(email.indexOf("@")+1, email.lastIndexOf( "."));
        System.out.println("domain = " + domain);
    }

// Create  a method that can display the name of the month based on the given number to the method

public static void nameOfMonth(int number){
        String name="";
        if(number>=1 && number <=12){

           name=(number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"March" :(number==4)?"Apr" :(number==5)?"May"
            :(number==6)?"Jun"  :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
             :(number==11)?"Nov":"Dec";
        }else{
            name="Invalid";
        }
    System.out.println("Month name= " +name);
}


// Create a method that can print the name of the day based on the given number to the method

public static void nameOfDay(int number){



}

// Create a method that can print how many days a month has

 public static void daysInMonth(int number){


 }


  // ageGroups(int age)




}
