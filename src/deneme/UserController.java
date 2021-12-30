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

    public static void registerUser(User user) {
        userArrayList.add(user);
    }

    public static boolean checkStudent(int studentNo) {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                int totalStudent = Student.getTotalStudent();
                for (int j = 0; j < totalStudent; j++) {
                    if (Student.getStudent_no() == studentNo) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkInstructor(String username) {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Instructor) {
                int totalInstructor = Instructor.getTotalInstructor();
                for (int j = 0; j < totalInstructor; j++) {
                    if (Instructor.getUsername().equals(username)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static String getStudent() {
        String result = "";
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                int totalStudent = Student.getTotalStudent();
                for (int j = 0; j < totalStudent; j++) {
                    result += userArrayList.get(i).toString();
                }
            }
        }
        return result;
    }

    public static String getInstructor() {
        String result = "";
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Instructor) {
                int totalInstructor = Instructor.getTotalInstructor();
                for (int j = 0; j < totalInstructor; j++) {
                    result += userArrayList.get(i).toString();
                }
            }
        }
        return result;
    }

    public static ArrayList displayInstructor() {
        ArrayList temp = new ArrayList();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Instructor) {
                temp.add(userArrayList.get(i).getId());
                temp.add(Instructor.getInstructor_id());
                temp.add(userArrayList.get(i).getFirstname());
                temp.add(userArrayList.get(i).getLastname());
                temp.add(userArrayList.get(i).getEmail());
            }
        }
        return temp;
    }
    
    /*public static ArrayList<Student> displayStudent() {
        ArrayList temp = new ArrayList();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                temp.add(userArrayList.get(i).getId());
                temp.add(userArrayList.get(i).getFirstname());
                temp.add(userArrayList.get(i).getLastname());
                temp.add(userArrayList.get(i).getEmail());
            }
        }
        return temp;
    }*/
    
    public static ArrayList<Student> displayStudent() {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) instanceof Student) {
                studentArrayList.add((Student) userArrayList.get(i));
            }
        }
        return studentArrayList;
    }

}
