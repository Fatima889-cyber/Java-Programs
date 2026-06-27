import java.util.Scanner;

public class ArrayConcept {
    static void main(String[] args) {
        int[] marks = new int[5];
        Scanner input = new Scanner(System.in);
        for (int c = 0; c <= 4; c++) {
            marks[c] = input.nextInt();
        }

        for (int c = 0; c <= 4; c++) {
            System.out.println("Element at " + c + " index is :" + marks[c]);
        }

    }
}
