package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);



/*
        for (Integer element : list) {

            int frequency=0;
            if(element==each){
                frequency++;
        }
        }

         if(frequency==1){
         System.out.println(each);
         break;
}
*/




    }
}
