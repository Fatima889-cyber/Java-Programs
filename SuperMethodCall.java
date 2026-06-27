class Parent{

     public void plot()
    {
        System.out.println("I want to build a Hospital...");
    }
}
class Child extends Parent
{
    public void plot()
    {
        System.out.println("I want to build a Company...");
    }
    public void show()
    {
        //super word parent class ky method ko call karay ga...
        super.plot();
        //plot();
    }
}

public class SuperMethodCall {
    static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
