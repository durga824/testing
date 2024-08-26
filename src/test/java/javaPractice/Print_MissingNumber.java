package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class Print_MissingNumber {

    public static void main(String[] args) {

        int[] givenNumbers = {1, 2, 4, 6, 7, 9, 10};

        // Create a set of numbers from 1 to 10
        Set<Integer> fullSet = new HashSet<>();
        for (int i = 0; i<=10; i++){
            fullSet.add(i);
        }

        // Remove the numbers present in the input array from the full set
        for (int num: givenNumbers){
            fullSet.remove(num);
        }

        // The remaining numbers in the set are the missing numbers
        System.out.println("The remaining numbers are: ");
        for (int rem: fullSet){
            System.out.println(rem);
        }

                String input = "aiou"; // Example input

                // Convert the input string to a set of characters
                Set<Character> inputSet = new HashSet<>();
                for (char c : input.toCharArray()) {
                    inputSet.add(c);
                }

                // Set of all vowels
                Set<Character> vowelsSet = new HashSet<>();
                vowelsSet.add('a');
                vowelsSet.add('e');
                vowelsSet.add('i');
                vowelsSet.add('o');
                vowelsSet.add('u');

                // Remove the characters present in the input from the vowels set
                vowelsSet.removeAll(inputSet);

                // The remaining characters in the set are the missing vowels
                System.out.println("Missing vowels:");
                for (char missing : vowelsSet) {
                    System.out.println(missing);
                }
    }

}
