package javaPractice;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("abd t yes ishd"));
    }

    static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }

}
