package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {



        char[]  letters = new char[26];
/*
        for(char i='A', j=0; i<='Z' && j<letters.length; i++,  j++){
            letters[j]=i;
        }
*/

  /*
    for(int i=0, j= 'A'; i<letters.length; i++){  // i: index numbers 0~last index
        letters[i] =(char)j;
    }
*/
     char ch = 'A';
      for(int i= 0; i<letters.length; i++){  // ch++ can type here
          letters[i]  = ch; // ch++; or ch;
          ch++;
      }





        System.out.println(Arrays.toString(letters));


        System.out.println("--------------------------------------");

char[] letters2= new char[26]; // [Z~A]













    }
}
