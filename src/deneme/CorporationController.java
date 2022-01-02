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
    public static Corporation logged;

    public static void registerCorporation(Corporation corporation) {
        corporationArrayList.add(corporation);
    }

    public static boolean checkCorporation(String corporationEmail, String corporationPsw) {
        for (int i = 0; i < corporationArrayList.size(); i++) {
            if (corporationArrayList.get(i) instanceof Corporation) {
                Corporation corporation = (Corporation) corporationArrayList.get(i);
                if (corporation.getC_email().equals(corporationEmail) && corporation.getC_password().equals(corporationPsw)) {
                    logged = corporationArrayList.get(i);
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList<Corporation> getAllCorporation() {
        return corporationArrayList;
    }

    public static Corporation getCorporationByStudent(String corporationName) {
        Corporation corporation;
        for (int i = 0; i < corporationArrayList.size(); i++) {
            if (corporationArrayList.get(i).getC_name().equals(corporationName)) {
                corporation = (Corporation) corporationArrayList.get(i);
                return corporation;
            }
        }
        corporation = new Corporation("", "", "", "", "", "", "", "");
        return corporation;
    }
    
}
