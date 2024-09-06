package javaPractice;

public class Swapping {

    public static void main(String[] args) {

        int a = 5, b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a value is " + a);
        System.out.println("b value is " + b);


    }
}
