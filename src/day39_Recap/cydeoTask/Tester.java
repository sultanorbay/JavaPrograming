package day39_Recap.cydeoTask;

public class Tester extends Employee{

    public void createTicket(){
        System.out.println(getJobTitle()+" " +getName()+" is creating ticket");
    }


    public Tester(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender, employeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing the application");
    }




}
