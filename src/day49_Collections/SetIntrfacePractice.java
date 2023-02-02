package day49_Collections;

import java.util.*;

public class SetIntrfacePractice {

    public static void main(String[] args) {




         Set<Integer>  hashSet = new HashSet<>();
         hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));

         System.out.println("hashSet = " + hashSet);


         Set<Integer>  linkedHashSet = new LinkedHashSet<>();

         linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));

         System.out.println("linkedHashSet = " + linkedHashSet);


         Set<Integer>  treeSet = new TreeSet<>();
         treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
         treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));

         System.out.println("treeSet = " + treeSet);

       //  String str = null;

       //  System.out.println(str.charAt(0));




    }
}
