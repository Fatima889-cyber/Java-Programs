import java.util.Scanner;
public class IfElseProgram {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = input.nextInt();

        if (marks >=60){
            System.out.println("You are pass...");
        } else {
            System.out.println("You are fail...");
        }
    }
}
