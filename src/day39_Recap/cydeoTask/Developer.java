package day39_Recap.cydeoTask;

public class Developer extends Employee{

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");
    }

    public Developer(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender, employeID, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing the application");
    }








}
