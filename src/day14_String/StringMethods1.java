package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

     String str1 = "    batch 25   ";
       str1= str1.trim(); //"batch 25"

        System.out.println(str1);

        String str2 = "Cydeo School";

int n1=str2.indexOf("h");  // 8
        System.out.println("n1 = " + n1);

        int n2 =str2.indexOf("ool"); // 9
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
       int n3= str3.indexOf("amm");
        System.out.println("n3 = " + n3);  // 10

int n4 = str3.indexOf("gua");  //20
        System.out.println("n4 = " + n4);

      int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5); // 23


        System.out.println("--------------------------------");


        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA= s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
     //   int fourthA = s.indexOf("ava W"); 11
     //  int fourthA = s.lastIndexOf("av"); 11
        int fourthA= s.indexOf("Ca") + 1;
        int fifthA = s.lastIndexOf("va") + 1;
        int sixth = s.lastIndexOf("aw");
        int seventhA = s.indexOf("a o");


        System.out.println("firstA = " + firstA); // 1
        System.out.println("lastA = " + lastA); // 22
        System.out.println("secondA = " + secondA);  // 3
        System.out.println("thirdA = " + thirdA);  // 8
        System.out.println("fourthA = " + fourthA); // 11
        System.out.println("fifthA = " + fifthA); // 13
        System.out.println("sixth = " + sixth);  // 16
        System.out.println("seventhA = " + seventhA);  // 18





    }
}
