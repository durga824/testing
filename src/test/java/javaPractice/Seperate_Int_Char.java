package javaPractice;

public class Seperate_Int_Char {

    public static void main(String[] args) {

        String mixed = "a1b2c3d4e5";

        StringBuilder numbers = new StringBuilder();
        StringBuilder characters = new StringBuilder();

        for (char c:mixed.toCharArray()) {
            if (Character.isDigit(c)){
                numbers.append(c);
            }else if (Character.isLetter(c)){
                characters.append(c);
            }
        }

        System.out.println("Numbers are:" + numbers.toString());
        System.out.println("Characters are:" + characters.toString());
    }
}
