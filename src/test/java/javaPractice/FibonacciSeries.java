package javaPractice;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int n = scanner.nextInt();

        // Variables to store the first two terms
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        // Print the first two terms
        System.out.print(first + " " + second);

        for (int i = 3; i<=n; i++){
            int next = first + second;
            System.out.println(""+next);
            first = second;
            second = next;
        }
        scanner.close();
    }

}
