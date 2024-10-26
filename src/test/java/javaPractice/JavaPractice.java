package javaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class JavaPractice {

    public static void main(String[] args) {

       /* ArrayList al  = new ArrayList();
        al.add("A");
        al.add("10");
        al.add("A");

        System.out.println(al);

        al.remove(2);

        al.add(2, "2343");
        System.out.println(al); */


//        int a[] = new int[5];  // Declares an array and allocates memory for the value
//        a[0] = 2;
//        a[1] = 7;
//        a[2] = 6;
//
//        String test[] = new String[3];
//        test[0] = "Durga";
//        test[1] = "Testing";
//        test[2] = "Automation";
//
//        int b[] = {4, 6, 8, 10, 33};
//
//        for (int i = 0; i<test.length; i++){
//            System.out.println(test[i]);


        int[] num = {2, 5, 3, 5, 6, 7, 6};

        HashSet<Integer> see = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int n: num) {
            if (!see.add(n)){
                duplicates.add(n);
        }

    }

        System.out.println(duplicates);

    }
}
