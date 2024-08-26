package javaPractice;

public class RemoveLeadingSpace {

    public static void main(String[] args) {

        String s = "  abc  def\t";

        s = s.trim();

        System.out.println(s);
    }
}
