class People {
    // Private data (hidden)
    private String name;
    private int age;

    // Setter methods (to set values)
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {

        age = a;
    }

    // Getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Object create
        People people = new People();
        // Setting values using setters
        people.setName("Fatimah");
        people.setAge(19);
        // Getting values using getters
        System.out.println("Name: " + people.getName());
        System.out.println("Age: " + people.getAge());
    }
}
