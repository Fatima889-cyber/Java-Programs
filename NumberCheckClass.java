import java.util.Scanner;
public class NumberCheckClass {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
          count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Prime Number....");
        }else{
            System.out.println("Not Prime Number....");
        }
    }
}
