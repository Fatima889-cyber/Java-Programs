abstract class Boss
{ abstract void plot ();
    public void vehical ()
    {
        System.out.println("I have a Car..");
    }
}
class Employee extends Boss
{ public void plot()
    {
        System.out.println("I build a Hospital...");
    }
}
public class AbstractClass {
    static void main(String[] args) {
        Employee emp = new Employee();
        emp.plot();
        emp.vehical();}
    }



