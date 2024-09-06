package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {

//        1---> String Reverse
        String name = "Durga sample";

        StringBuilder stringBuilder = new StringBuilder(name);
        System.out.println(stringBuilder.reverse());

//      2---->  Print missing number
        int[] given = {2,4,6,9};
        Set<Integer> fullSet = new HashSet<>();

        for (int i = 0; i<=10; i++){
            fullSet.add(i);
        }
//
//        removing numbers
        for (int n:given){
            fullSet.remove(n);
        }
        System.out.println(fullSet);




//     3--->   Check given number is even or Odd

//        int[] given = {2,5,8,11,16,19};

        System.out.println("The even numbers are:");
        for (int i=0; i<given.length; i++){
            if (given[i] % 2 == 0){
                System.out.println(given[i]);
            }
        }

        System.out.println("The Odd numbers are");
        for (int i=0; i<given.length; i++){
            if (given[i] %2 != 0){
                System.out.println(given[i]);
            }
        }
    }

}
