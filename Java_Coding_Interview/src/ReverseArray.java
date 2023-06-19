/* Take an array of any size and reverse the order of its elements */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
        //initialise array to reverse
        int[] myArray = {1, 2, 3, 4, 5};

        //initialise array to store reversed elements
        int[] newArray = new int[myArray.length];
        
        //store first array elements in new array elements in reverse order
        for (int i = myArray.length - 1, k = 0 ; i >= 0 ; i--){
            newArray[k++] = myArray[i];
        }

        //display results using Arrays.toString
        System.out.println("Initial Array " + Arrays.toString(myArray));
        System.out.println("Reversed Array " + Arrays.toString(newArray));
    }
    
}
