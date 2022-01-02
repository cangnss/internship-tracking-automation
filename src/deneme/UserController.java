/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.ArrayList;

/**
 *
 * @author Can
 */
public class UserController {

    public static ArrayList<User> userArrayList = new ArrayList<User>();
    public static User loggedUser;

    public static void registerUser(User user) {
        userArrayList.add(user);
    }

    public static boolean checkStudent(String studentEmail, String studentPassword) {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                if (userArrayList.get(i).getPassword().equals(studentPassword) && userArrayList.get(i).getEmail().equals(studentEmail)) {
                    loggedUser = userArrayList.get(i);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkInstructor(String username, String instructorPassword) {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Instructor) {
                Instructor instructor = (Instructor) userArrayList.get(i);
                if (instructor.getUsername().equals(username) && userArrayList.get(i).getPassword().equals(instructorPassword)) {
                    loggedUser = userArrayList.get(i);
                    loggedUser.setIsInstructor(true);
                    return true;
                }
            }
        }
        return false;
    }

    public static String getStudent() {
        String result = "";
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                result += userArrayList.get(i).toString();
            }
        }
        return result;
    }
    /*
    public static String getStudentByCorporation(int corporationId) {
        String result = "";
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                Student student = (Student) userArrayList.get(i);
                if (corporationId == student.getCorporationId()) {
                    result += userArrayList.get(i).toString();
                }
            }
        }
        return result;
    }*/

    public static String getInstructor() {
        String result = "";
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Instructor) {
                result += userArrayList.get(i).toString();
            }
        }
        return result;
    }

    public static ArrayList<Instructor> displayInstructor() {
        ArrayList<Instructor> instructorArrayList = new ArrayList<Instructor>();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Instructor) {
                instructorArrayList.add((Instructor) userArrayList.get(i));
            }
        }
        return instructorArrayList;
    }

    public static ArrayList<Student> displayStudent() {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                studentArrayList.add((Student) userArrayList.get(i));
            }
        }
        return studentArrayList;
    }

    public static Instructor getInstructorByStudent(String instructorName) {
        Instructor instructor;
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).getFirstname().equals(instructorName)) {
                instructor = (Instructor) userArrayList.get(i);
                return instructor;
            }
        }
        instructor = new Instructor("", "", "", "", "", "", "", "", "", "", "");
        return instructor;
    }
}
