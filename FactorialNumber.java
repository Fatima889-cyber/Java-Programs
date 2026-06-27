public class FactorialNumber {
    static void main(String[] args) {
        int num =5;
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact *=i;
        }
        System.out.println("Number of Factorial is : " + fact);
    }
}
