import java.util.Scanner;

public class TwoDimArray {
    static void main(String[] args) {
        int [][]mat = new int[2][2];

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                mat[i][j] = input.nextInt();

        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                System.out.print("Element at" +i+j+ " index is : "+ mat[i][j]);
    }
}
