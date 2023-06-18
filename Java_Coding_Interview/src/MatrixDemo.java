import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows in the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int cols = scanner.nextInt();
        
        int matrix[][] = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++){
            for (int k = 0; k < cols; k++){
                matrix[k][i] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < rows; i++){
            for (int k = 0; k < cols; k++){
                System.out.print(" ");
                if (matrix[k][i] < 10){
                    System.out.print(" ");
                }
                System.out.print(matrix[k][i]);
                
            }
            System.out.println();
        }
        scanner.close();

    }
    
}