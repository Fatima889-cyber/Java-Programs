import java.util.Scanner;

public class MatrixAddition {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int rows = 2;
        int cols = 2;
        int [][] A = new int [rows][cols];
        int [][] B = new int [rows][cols];
        int [][] C = new int [rows][cols];

        //Input Matrix A
        System.out.println("Enter elements of Matrix A : ");
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print("Element of "+i+j + " index is: ");
                A[i][j] = input.nextInt();
            }
        }

        //Display Matrix A
        System.out.println("\nMatrix A is : ");
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        //Input Matrix B
        System.out.println("\nEnter elements of Matrix B: ");
         for(int i=0; i<rows; i++) {
             for (int j = 0; j < cols; j++) {
                 System.out.print("Element of " + i + j + " index is: ");
                 B[i][j] = input.nextInt();
             }
         }

         //Display Matrix B
        System.out.println("\nMatrix B is : ");
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        //Addition
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //Display Result
        System.out.println("\nResult of AdditionMatrix is : ");
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
