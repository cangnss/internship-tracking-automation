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
    private static ArrayList<User> userArrayList = new ArrayList<User>();
    
    
    public static void registerUser(User user){
        
        userArrayList.add(user);

    }
    
    
    public static boolean checkStudent(int studentNo){
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
    
    
    
    public static String getStudent(){
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
    
    public static String getInstructor(){
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
}
