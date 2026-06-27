 class student{
      String name;
      int age;

    void display() {
    System.out.println("Name:" + name);
    System.out.println("Age:" + age);
   }
}



public class OOPExample {
    public static void main(String[] args) {
        student student = new student();
        student.name = "Fatima..";
        student.age = 19;
        student.display();
    }
}
