/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_uas_19631006;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class koneksi {
    private final String url = "jdbc:mysql://localhost/uas_pbo";
    
    public Connection getKoneksi(){
        Connection con = null;
        try {
            con =  DriverManager.getConnection(url, "root", "");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
