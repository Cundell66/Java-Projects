import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to reverse: ");
        String word = scanner.nextLine();
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println(word + " reversed is " + reversedWord);
        scanner.close();
    }
}
