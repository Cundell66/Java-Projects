import java.util.Arrays;

public class Array_Delete {
    public static void main(String[] args) {
        
        int arrayLength = 10;
        int indexToDelete = 4;
        
        //initialise arrays
        int[] myArray = new int[arrayLength];
        int[] newArray = new int[myArray.length-1];
        
        //fill initial array
        for (int i = 0; i < arrayLength; i++){
            myArray[i] = i;
        }
        
        //display contents of initial array
        System.out.println("Initial Array " + Arrays.toString(myArray));
        
        //remove contents of index location
        //int count = 0;
        for (int i = 0, count=0; i < myArray.length; i++){
            if (i == indexToDelete){
                continue;
            }
            newArray[count++] = i;
            
        }
        myArray = newArray;

        //display contents of final array
        System.out.println("Final Array " + Arrays.toString(myArray));

    }
    
}
