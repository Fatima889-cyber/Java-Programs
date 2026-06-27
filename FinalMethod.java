class parent
{   //final kw method/function  ko override nahi honay deta..
   final void display()
   {

       System.out.println("I'm a student of BSCS...");
   }
}
class child extends parent
{
   // void display()  error

}

public class FinalMethod {
    static void main(String[] args) {
        parent p = new parent();
        p.display();
    }
}
