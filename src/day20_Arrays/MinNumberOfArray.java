package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

      int[] numbers ={100, 500, 30,40,600,80,90};

      int min = numbers[0]; // 100

        for (int i = 0; i < numbers.length; i++) {  // i: 0,1,2,3...

            if(numbers[i] <min){  // if there is an elemnt in the array thas smaller
                min = numbers[i];  // smaller number will be assin to the variable min
            }

        }


        System.out.println(min);




















    }
}
