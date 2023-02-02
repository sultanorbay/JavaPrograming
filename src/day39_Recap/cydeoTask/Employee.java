package day39_Recap.cydeoTask;

public class Employee extends Person{

    private int employeeID;
    private String jobTitle;
    private double salary;

    public int getEmployeID() {
        return employeeID;
    }

    public void setEmployeID(int employeID) {
        this.employeeID = employeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    public Employee(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender);
       setEmployeID(employeeID);
       setJobTitle(jobTitle);
       setSalary(salary);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }






}
