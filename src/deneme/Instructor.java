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
public class Instructor extends User {

    private int instructor_count_id;
    private String username;
    private static int totalInstructor = 0;
    
    public Instructor(String firstname, String lastname, String birthday, String faculty_name, String department_name, String email, String password, String address, String phone, String photo, String username) {
        super(firstname, lastname, birthday, faculty_name, department_name, email, password, address, phone, photo);
        this.instructor_count_id = totalInstructor + instructor_count_id + 1;
        this.username = username;
        totalInstructor++;
    }
    
    /**
     * @return the instructor_count_id
     */
    public int getInstructor_count_id() {
        return instructor_count_id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the totalInstructor
     */
    public static int getTotalInstructor() {
        return totalInstructor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Username: " + getUsername();
    }

}
