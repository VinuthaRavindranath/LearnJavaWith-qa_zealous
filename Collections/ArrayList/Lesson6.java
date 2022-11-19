package Collections.ArrayList;

//User-defined class objects in Java ArrayList
// example where we are storing Student class object in an array list.
import java.util.ArrayList;
import java.util.Iterator;

class Student {
    String Name;
    int rollNumber;
    int studentAge;
    String standard;

    Student(String Name, int rollNumber, int studentAge, String standard) {
        this.Name = Name;
        this.rollNumber = rollNumber;
        this.studentAge = studentAge;
        this.standard = standard;

    }
}

public class Lesson6 {
    public static void main(String[] args) {
        Student s1 = new Student("Micky", 99007, 12, "6th");
        Student s2 = new Student("Minni", 99001, 12, "6th");
        Student s3 = new Student("Donald", 99005, 12, "6th");
        Student s4 = new Student("Harry", 99002, 12, "6th");
        Student s5 = new Student("Ron", 99006, 12, "6th");
        Student s6 = new Student("Snape", 99004, 12, "6th");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student st = it.next();
            System.out.println(st.Name + " " + st.rollNumber + " " + st.studentAge + " " + st.standard);
        }
    }
}
