/* Program to take in a string and reverse it */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //Ask for input of word to reverse
        System.out.println("Enter the word to reverse: ");
        String word = scanner.nextLine();
        
        //using stringbuilder reverse the string
        String reversedWord = new StringBuilder(word).reverse().toString();
        
        //display original string and it's reverse
        System.out.println(word + " reversed is " + reversedWord);

        scanner.close();
    }
}
