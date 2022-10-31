package StaticAndFinal;

import java.util.Date;

class Student {
    private static String rollNo;
    private static int count = 1;

    private String generateRollNumber() {
        Date d = new Date();
        String rn = "Univ-" + (d.getTime() + 1900) + "-" + count;
        count++;
        return rn;
    }

    Student() {
        rollNo = generateRollNumber();
    }

    public String getRollNo() {
        return rollNo;
    }
}

public class Lesson5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getRollNo());
        Student s2 = new Student();
        System.out.println(s2.getRollNo());
        Student s3 = new Student();
        System.out.println(s3.getRollNo());
    }

}
