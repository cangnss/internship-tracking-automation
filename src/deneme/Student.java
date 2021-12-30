/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.Date;

/**
 *
 * @author Can
 */
public class Student extends User {

    private int student_id;
    private static int student_no;
    private double gano;
    private static int totalStudent = 0;

    public Student(String firstname, String lastname, String birthday, String faculty_name, String department_name, String email, char[] password, String address, String phone, String photo, int student_no, double gano) {
        super(firstname, lastname, birthday, faculty_name, department_name, email, password, address, phone, photo);
        this.student_id++;
        this.student_no = student_no;
        this.gano = gano;
        totalStudent++;
    }

    /**
     * @return the student_id
     */
    public int getStudent_id() {
        return student_id;
    }

    /**
     * @return the student_no
     */
    public static int getStudent_no() {
        return student_no;
    }

    /**
     * @return the gano
     */
    public double getGano() {
        return gano;
    }

    /**
     * @return the totalStudent
     */
    public static int getTotalStudent() {
        return totalStudent;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Student no: " + getStudent_no() + "\n"
                + "Gano: " + getGano() + "\n*****************************";
    }

}
