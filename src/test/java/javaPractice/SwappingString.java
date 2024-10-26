package javaPractice;

public class SwappingString {

    public static void main(String[] args) {
        String n1 = "Durga";
        String n2 = "Rao";

        System.out.println("Before swapping:");
        System.out.println("n1 is:" + n1);
        System.out.println("n2 is:" + n2);

        n1 = n1+n2;
        n2 = n1.substring(0, n1.length() - n2.length());
        n1 = n1.substring(n2.length());

        System.out.println("After swapping:");
        System.out.println("n1 is:" + n1);
        System.out.println("n2 is:" + n2);
    }
}
