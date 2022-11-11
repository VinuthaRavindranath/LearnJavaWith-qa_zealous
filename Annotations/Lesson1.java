/** @author Vinutha
 * @version 2.0
 * @since 2011
 **/
package Annotations;

/**
 * @author Vinutha
 *         Class for Library book
 **/

public class Lesson1 {
    static int val = 10;

    /**
     * @param s Book Name
     **/

    public Lesson1(String s) {

    }

    /**
     * Issue a book to a student
     * 
     * @param roll number of a Student
     * @throws Exception if book is not available, throws Exception
     **/

    public void issue(int roll) throws Exception {

    }

    /**
     * Check if book is Available
     * 
     * @param str book name
     * @return if book is available returns true else false
     **/

    public boolean available(String str) {
        return true;
    }

    /**
     * Get book name
     * 
     * @param id is book id
     * @return returns book name
     **/

    public String getName(int id) {
        return "";
    }
}
