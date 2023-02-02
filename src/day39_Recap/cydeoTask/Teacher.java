package day39_Recap.cydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender, employeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }
}
