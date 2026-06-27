class overloading
{
    public void Add()
    {
        System.out.println("no parameters...");
    }
    public void Add(int num1, int num2)
    {
        System.out.println(" Sum is : "+(num1+num2));
    }
    public void Add(int num1, int num2, int num3)
    {
        System.out.println(" Sum is : " +(num1+num2+num3));
    }
}

public class OverloadingConcept {
    static void main(String[] args) {

        overloading obj  = new overloading();
        
        obj.Add();
        obj.Add(2,4);
        obj.Add(10,20,30);
    }
}
