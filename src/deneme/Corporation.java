/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

/**
 *
 * @author Can
 */
public class Corporation {
    private int id;
    private String c_name;
    private String c_email;
    private String c_password;
    private String c_phone;
    private String c_type;
    private String c_address;
    private String c_sector;
    private String c_photo;
    private static int totalCorporationCount=0;
    
    
    public Corporation(int id, String c_name, String c_email, String c_password, String c_phone, String c_type, String c_address, String c_sector, String c_photo){
        this.id = id;
        this.c_name = c_name;
        this.c_email = c_email;
        this.c_password = c_password;
        this.c_phone = c_phone;
        this.c_type = c_type;
        this.c_address = c_address;
        this.c_sector = c_sector;
        this.c_phone = c_phone;
        this.c_photo = c_photo;
        totalCorporationCount++;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the c_name
     */
    public String getC_name() {
        return c_name;
    }

    /**
     * @return the c_email
     */
    public String getC_email() {
        return c_email;
    }

    /**
     * @return the c_password
     */
    public String getC_password() {
        return c_password;
    }

    /**
     * @return the c_phone
     */
    public String getC_phone() {
        return c_phone;
    }

    /**
     * @return the c_type
     */
    public String getC_type() {
        return c_type;
    }

    /**
     * @return the c_address
     */
    public String getC_address() {
        return c_address;
    }

    /**
     * @return the c_sector
     */
    public String getC_sector() {
        return c_sector;
    }

    /**
     * @return the c_photo
     */
    public String getC_photo() {
        return c_photo;
    }
    
    @Override
    public String toString(){
        return "Corporation name: " + getC_name() + "\n"
               +"Corporation E-mail: " + getC_email() + "\n"
               +"Corporation Phone: " + getC_phone() + "\n"
               +"Corporation Type: " + getC_type() + "\n"
               +"Corporation Sector: " + getC_sector() + "\n"
               +"Corporation Photo: " + getC_photo();
    }

    /**
     * @return the totalCorporationCount
     */
    public static int getTotalCorporationCount() {
        return totalCorporationCount;
    }
    
}
