/* Program to rotate an array one element to the left - replacing the last element with the first */

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        
        int[] myArray = {1, 2, 3, 4, 5};
        //display initial array
        System.out.println("Initial Array: " + Arrays.toString(myArray));

        //store the first element in the temp variable
        int temp = myArray[0];

        //replace the nth element with the nth+1 element
        for (int i = 0; i < myArray.length-1; i++){
            myArray[i] = myArray[i + 1];
        }

        //replace the last element with the temp variable
        myArray[myArray.length - 1] = temp;

        //display the new array
        System.out.println("Step To Left Array: " + Arrays.toString(myArray));

    }
    
}
