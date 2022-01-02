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
public abstract class User {

    private int id;
    private String firstname;
    private String lastname;
    private String birthday;
    private String faculty_name;
    private String department_name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String photo;
    private boolean isInstructor=false;
    private static int totalUser=0;

    public User( String firstname, String lastname, String birthday, String faculty_name, String department_name, String email, String password, String address, String phone, String photo) {
        this.id++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.faculty_name = faculty_name;
        this.department_name = department_name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.photo = photo;
        totalUser++;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @return the faculty_name
     */
    public String getFaculty_name() {
        return faculty_name;
    }

    /**
     * @return the department_name
     */
    public String getDepartment_name() {
        return department_name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    @Override
    public String toString() {
        return "Firstname: " + getFirstname() + "\n"
                + "Lastname: " + getLastname() + "\n"
                + "Birthday: " + getBirthday() + "\n"
                + "Faculty name: " + getFaculty_name() + "\n"
                + "Department name: " + getDepartment_name() + "\n"
                + "E-mail: " + getEmail() + "\n"
                + "Password: " + getPassword() + "\n"
                + "Address: " + getAddress() + "\n"
                + "Phone: " + getPhone() + "\n"
                + "Photo: " + getPhoto();
    }

    /**
     * @return the isInstructor
     */
    public boolean isIsInstructor() {
        return isInstructor;
    }

    /**
     * @param isInstructor the isInstructor to set
     */
    public void setIsInstructor(boolean isInstructor) {
        this.isInstructor = isInstructor;
    }

}
