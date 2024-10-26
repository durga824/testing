package javaPractice;

import java.util.HashSet;

public class RemoveDuplicateChar {

    public static String removeDuplicates(String input){

        HashSet<Character> seen = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()){
            if (!seen.contains(c)){
                seen.add(c);
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String name = "Ella Durga Rao";
        String result = removeDuplicates(name);

        System.out.println("Without duplicates: "+ result);
    }
}
