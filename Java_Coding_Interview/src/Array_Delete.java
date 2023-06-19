/* Remove a specific element and it's contents from an array of any size */

import java.util.Arrays;

public class Array_Delete {
    public static void main(String[] args) {
        
        // declare size of array and element to remove 
        int arrayLength = 10;
        int indexToDelete = 4;
        
        //initialise initial array
        int[] myArray = new int[arrayLength];
        //initialise amended array, 1 element shorter than initial array
        int[] newArray = new int[myArray.length-1];
        
        //fill initial array
        for (int i = 0; i < arrayLength; i++){
            myArray[i] = i;
        }
        
        //display contents of initial array
        System.out.println("Initial Array " + Arrays.toString(myArray));
        
        //remove contents of index location by building new array without that element
        for (int i = 0, count=0; i < myArray.length; i++){
            
            //skip the designated element
            if (i == indexToDelete){
                continue;
            }
            newArray[count++] = myArray[i];
            
        }
        
        //display contents of final array
        System.out.println("Final Array " + Arrays.toString(newArray));

    }
    
}
