/* Program to take an array of integers of any size and insert an integer at any position within that array*/

import java.util.Arrays;
import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //initialise initial array
        int myArray[] = {10, 20, 40, 50, 60, 70, 80, 90, 100};

        //initialise new array 1 element bigger than initial array
        int newArray[] = new int[myArray.length + 1];

        //ask for integer to insert and position(not index) to insert it
        System.out.println("Enter the integer value to insert: ");
        int newValue = scanner.nextInt();
        System.out.println("Enter the position to insert it at between 1 and " + myArray.length + ":  ");
        int newPosition = scanner.nextInt();
        int newIndex = newPosition - 1;

        //build new array with space for new element
        for (int i = 0, k = 0; i < myArray.length; i++){
            
            //insert space for new element at designated index
            if (i == newIndex){
                k++;
            }
            newArray[k] = myArray[i];
            k++;
            
        }
        //insert new value at given position
        newArray[newIndex] = newValue;

        //display results keeping initial array in tact
        System.out.println("Initial Array" + Arrays.toString(myArray));
        System.out.println("New Array" + Arrays.toString(newArray));
        
        scanner.close();
    }
    
}
