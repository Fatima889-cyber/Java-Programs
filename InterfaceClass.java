interface Father
{
    abstract void plot();
}
interface Mother
{
    abstract void company();
}
class Child implements Father, Mother{
    public void plot()
    {

        System.out.println("I want to build a Hospital...");
    }
    public void company()
    {
        System.out.println("I start company with employee's");
    }
}
public class InterfaceClass {
    static void main(String[] args) {
      Child child = new Child();
      child.plot();
      child.company();
    }
}
