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
public class Student extends User{

    private int student_id;
    private int student_no;
    private double gano;
    private static String pdfFile;
    private String corporation_name;
    private static int totalStudent = 0;
    private static boolean internStatus = false;
    private Instructor instructor;
    private Corporation corporation;
    
    public Student(int student_no, String firstname, String lastname, String birthday, String faculty_name, String department_name, String email, String password, String address, String phone, String photo, double gano, String corporation_name, Instructor instructor, Corporation corporation) {
        super(firstname, lastname, birthday, faculty_name, department_name, email, password, address, phone, photo);
        this.student_id = totalStudent + student_id + 1;
        this.student_no = student_no;
        this.gano = gano;
        this.instructor = instructor;
        this.corporation = corporation;
        this.corporation_name = corporation_name;
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
    public int getStudent_no() {
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

    /**
     * @return the internStatus
     */
    public static boolean isInternStatus() {
        return internStatus;
    }

    /**
     * @param internStatus the internStatus to set
     */
    public static void setInternStatus(boolean internStatus) {
        Student.internStatus = internStatus;
    }

    /**
     * @return the pdfFile
     */
    public static String getPdfFile() {
        return pdfFile;
    }

    /**
     * @param aPdfFile the pdfFile to set
     */
    public static void setPdfFile(String aPdfFile) {
        pdfFile = aPdfFile;
    }

    /**
     * @return the instructorId
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * @return the corporation
     */
    public Corporation getCorporation() {
        return corporation;
    }

}
