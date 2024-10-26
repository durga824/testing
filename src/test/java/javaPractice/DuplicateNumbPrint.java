package javaPractice;

import java.util.HashSet;

public class DuplicateNumbPrint {

    public static void main(String[] args) {

        int [] act = {2,4,6,3,2,4,7,6};

        HashSet<Integer> normal = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int n:act) {
            if (!normal.add(n)){
                duplicates.add(n);
            }

        }

        System.out.println(normal);
    }
}
