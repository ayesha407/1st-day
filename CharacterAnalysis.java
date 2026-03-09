import java.util.Scanner;

public class CharacterAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("It is a letter");

            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase letter");
            } else {
                System.out.println("Lowercase letter");
            }
        }
        else if (Character.isDigit(ch)) {
            System.out.println("It is a digit");
        }
        else if (Character.isWhitespace(ch)) {
            System.out.println("It is a whitespace");
        }
        else {
            System.out.println("It is a symbol");
        }
    }
}
