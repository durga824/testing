package javaPractice;
import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

//        List<String> al = new ArrayList<>();
//        al.add("Sam");
//        al.add("Sita");
//
//        System.out.println(al);
//
//        al.remove(1);
//
//        System.out.println("Aftre Deleting" + al);

        String name = "My name is Ramu";
        String reversed = "";
//
//        for (int i = name.length()-1; i>=0; i--){
//
//            reversed +=name.charAt(i);
//        }

        StringBuilder sb = new StringBuilder(name);
        reversed = sb.reverse().toString();

        System.out.println("reversed word is :" + reversed );
    }



}
