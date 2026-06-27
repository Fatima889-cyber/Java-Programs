public class ExceptionHandling{
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println("value of array is :" + arr[7]);
        } catch (Exception e) {
            System.out.println("Value does not exist...");
        }finally {
            System.out.println("Exception Handled...");
        }
    }
}
