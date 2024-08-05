package javaPractice;
import java.util.ArrayList;
import java.util.List;

public class MultiDimentionalArray {

    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        al.add("Sam");
        al.add("Sita");

        System.out.println(al);

        al.remove(1);

        System.out.println("Aftre Deleting" + al);
    }



}
