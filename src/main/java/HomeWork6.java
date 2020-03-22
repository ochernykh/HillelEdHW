import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to reverse...");
        String textToReverse = scanner.nextLine();
        reverseString(textToReverse);
        scanner.close();
    }

    private static void reverseString (String toReverse) {
        StringBuilder string = new StringBuilder();
        for (int i = toReverse.length()-1; i >= 0 ; i--) {
            string.append(toReverse.charAt(i));
        }
        System.out.println(String.format("Original text was: %s  \n" +
                "Reversed text is: %s",toReverse, string.toString()));
    }
}
