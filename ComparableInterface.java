import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

    int stId;
    String stName;
    int stMarks;

    Student(int stId, String stName, int stMarks)
    {
        this.stId = stId;
        this.stName = stName;
        this.stMarks = stMarks;
    }

    @Override
    public int compareTo(Student o) {
        return stName.compareTo(o.stName);
    }
}

public class ComparableInterface {
    static void main(String[] args) {

        ArrayList<Student> st_list = new ArrayList<>();
        st_list.add(new Student(10, "Faisal",65));
        st_list.add(new Student(5, "Ali",12));
        st_list.add(new Student(8, "Zain",48));

        Collections.sort(st_list);
        for(Student st:st_list)
            System.out.println("ID: "+st.stId+"\tName: "+st.stName+"\tMarks: "+st.stMarks);



    }

}
