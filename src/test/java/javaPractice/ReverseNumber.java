package javaPractice;

public class ReverseNumber {

    public static void main(String[] args) {

                int num = 2024;
                int reversed = 0;

                // Loop to reverse the digits of the number
                while (num != 0) {
                    int digit = num % 10;  // Get the last digit
                    reversed = reversed * 10 + digit;  // Add it to the reversed number
                    num = num / 10;  // Remove the last digit from the original number
                }

                System.out.println("Reversed number: " + reversed);
    }
}
