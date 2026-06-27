import java.util.ArrayList;
import java.util.Collections;
public class ArrayListConcept {
    static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Array list : " + list);
        list.set(2,9);
        System.out.println("After adding " + list);
        list.remove(1);
        System.out.println("After removing " + list);
        Collections.reverse(list);
        System.out.println("After reversing " + list);
    }
}
