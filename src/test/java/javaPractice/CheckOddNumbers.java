package javaPractice;

import java.util.Scanner;

public class CheckOddNumbers {

    public static void main(String[] args) {

//        int num[] = {2, 5, 7, 6, 13, 15};
//
//       System.out.println("Even numbers in the array are:");
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                System.out.println(num[i]);
//            }
//        }
//
//        System.out.println("Odd numbers in the array are:");
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 != 0) {
//                System.out.println(num[i]);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Number :");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is even.");
        }else {
            System.out.println(number + " is odd.");
        }
    }
}
