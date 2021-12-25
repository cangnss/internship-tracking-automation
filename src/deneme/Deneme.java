/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Can
 */
public class Deneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        MainJFrame mjf = new MainJFrame();
        mjf.setVisible(true);

        String url = "jdbc:postgresql://localhost:5432/FirstTryDatabase";
        Connection conn = DriverManager.getConnection(url,"postgres","Cangunes-bjk1");

        System.out.println("Opened database successfully");

    }

}
