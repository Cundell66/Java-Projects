import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Initial Array: " + Arrays.toString(myArray));

        int temp = myArray[0];

        for (int i = 0; i < myArray.length-1; i++){
            myArray[i] = myArray[i + 1];
        }
        myArray[myArray.length - 1] = temp;

        System.out.println("Step To Left Array: " + Arrays.toString(myArray));

    }
    
}
