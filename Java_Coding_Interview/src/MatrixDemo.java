import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {

        //initialize scanner for keyboard input  
        Scanner scanner = new Scanner(System.in);
        
        //request dimensions of matrix
        System.out.println("Enter the number of rows in the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int cols = scanner.nextInt();
        
        //initialize matrix
        int matrix[][] = new int[rows][cols];
        
        //fill matrix
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++){
            for (int k = 0; k < cols; k++){
                matrix[i][k] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println();
        //print matrix to console
        for (int i = 0; i < rows; i++){
            for (int k = 0; k < cols; k++){
                if (matrix[i][k] < 100){
                    System.out.print(" ");
                    if (matrix[i][k] < 10){
                        System.out.print(" ");
                    }
                }
                System.out.print(matrix[i][k]);
                System.out.print(" ");
                
            }
            System.out.println();
        }
        //close scanner to avoid leakage
        scanner.close();
    }
}
