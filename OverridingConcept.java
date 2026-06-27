class Parent {
    public void plot()
    {

        System.out.println("I have a plot...");
    }
}
class Child1 extends Parent {
   final public void plot() {
        System.out.println("I want to build a Hospital...");

    }
}
    class Child2 extends Parent {
        public void plot() {

            System.out.println("I want to build a College...");
        }
    }
    public class OverridingConcept {
        static void main(String[] args) {
            //Parent parent = new Parent();
            Parent ch1 = new Child1();
            Parent ch2 = new Child2();

             ch1.plot();
        }
    }
