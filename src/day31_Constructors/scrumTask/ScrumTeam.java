package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

   public String PO,BA,SM;
   public ArrayList<Tester> testersList = new ArrayList<>();
   public  ArrayList<Developer> devopsList = new ArrayList<>();
   public int dayOfSprint;

    public ScrumTeam(String PO, String BA, String SM, ArrayList<Tester> testersList, ArrayList<Developer> devopsList, int dayOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprint = dayOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }


    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));

    }


    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }


    public void addDevelopers(Developer[]  developers){
        devopsList.addAll( Arrays.asList(developers));
    }


    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeID== employeeID);
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf( p -> p.employeeId == employeeID);
    }
// employeeID!= employeeıd look later


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of tsters=" + testersList.size() +
                ", total number of developers=" + devopsList +
                ", dayOfSprint=" + dayOfSprint +
                '}';
    }







}
