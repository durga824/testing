package javaPractice;

public class SearchingElementInArray {

    public static void main(String[] args) {

        int num[] = {2, 7, 8, 14, 18};
        int searchelem = 14;

        for (int i = 0; i <= num.length; i++)
        {
            if (num[i] == searchelem){
                System.out.println("Element found");
                break;
            }
        }
    }
}
