package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company = "Amazon Inc";
        ProductOwner po= new ProductOwner( "Suhaib", 29, 'M', "PO", 1, 160000, company);

       BusinessAnalyst ba= new BusinessAnalyst( "Cihad", 30, 'M', "BA", 2, 150000, company);
        ScrumMaster sm= new ScrumMaster("Anel", 26, 'F', "SM",3,145000, company);

        Tester tester1= new Tester("Chinara", 32, 'F', "QA", 1425, 125000, company);
        Tester tester2= new Tester("Yasaman", 3, 'F', "QA", 1416, 130000, company);
        Tester tester3= new Tester("Irena", 29, 'F', "SDET", 1456, 1280000, company);
        Tester tester4= new Tester("Cihad", 26, 'M', "QA", 1456, 124567, company);
        Tester[]  testers= { tester1, tester2, tester3, tester4};

        Developer developer1= new Developer("Sultana", 28, 'F', "Java Developer", 8, 13508,company);

        ScrumTeam scrumTeam= new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------");


        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name +" : " +tester.salary);
        }

        System.out.println("----------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+ " : "+developer.salary);
        }

    }
}
