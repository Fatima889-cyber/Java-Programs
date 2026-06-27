class Person{
    String name;

     //Constructor
    Person() {
       name ="Fatima";
    }

    void show()
    {
        System.out.println("Name:"+name);
    }
}

public class Constructor {
    static void main(String[] args) {
        Person person = new Person();
        //Constructor call
        person.show();
    }
}
