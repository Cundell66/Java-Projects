import java.util.Arrays;
import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int myArray[] = {10, 20, 40, 50, 60, 70, 80, 90, 100};

        int newArray[] = new int[myArray.length + 1];

        System.out.println("Enter the integer value to insert: ");
        int newValue = scanner.nextInt();
        System.out.println("Enter the position to insert it at between 1 and " + myArray.length + ":  ");
        int newPosition = scanner.nextInt();
        int newIndex = newPosition - 1;

        
        for (int i = 0, k = 0; i < myArray.length; i++){
            if (i == newIndex){
                k++;
            }
            newArray[k] = myArray[i];
            k++;
            
        }
        newArray[newIndex] = newValue;
        System.out.println("Initial Array" + Arrays.toString(myArray));
        System.out.println("New Array" + Arrays.toString(newArray));
        myArray = newArray;
        System.out.println("Initial Array Copied" + Arrays.toString(myArray));
        
        scanner.close();
    }
    
}
