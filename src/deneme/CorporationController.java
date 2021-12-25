/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.ArrayList;
import deneme.Corporation;
/**
 *
 * @author Can
 */
public class CorporationController {
    private static ArrayList<Corporation> corporationArrayList = new ArrayList<Corporation>();
    
    
    public static void registerCorporation(Corporation corporation){
        corporationArrayList.add(corporation);
    }
    
    public static boolean checkCorporation(int studentNo){
        for (int i = 0; i < corporationArrayList.size(); i++) {
            if (corporationArrayList.get(i) instanceof Corporation) {
                int totalCorporation = Corporation.getTotalCorporation();
                for (int j = 0; j < totalCorporation; j++) {
                    if (Student.getStudent_no() == studentNo) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
   
}
