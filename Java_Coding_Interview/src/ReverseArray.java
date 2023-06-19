import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        
        int[] newArray = new int[myArray.length];
        
        for (int i = myArray.length - 1, k = 0 ; i >= 0 ; i--){
            System.out.println(myArray[i]);
            newArray[k++] = myArray[i];
            System.out.println(k);
        }
        System.out.println("Initial Array " + Arrays.toString(myArray));
        System.out.println("Reversed Array " + Arrays.toString(newArray));
    }
    
}
