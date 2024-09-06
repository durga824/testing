package javaPractice;

public class SumOfIntegers {

    public static void main(String[] args) {

                int num = 2024;
                int sum = 0;

                // Loop to calculate the sum of digits
                while (num > 0) {
                    sum += num % 10;  // Add the last digit to sum
                    num = num / 10;   // Remove the last digit from the number
                }

                System.out.println("Sum of digits: " + sum);

    }
}
