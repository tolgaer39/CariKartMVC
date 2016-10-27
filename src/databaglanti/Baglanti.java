/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaglanti;

import java.sql.*;

/**
 *
 * @author Engineer
 */
public class Baglanti {
    
    private static final String driver=("com.mysql.jdbc.Driver");
    private static final String url="jdbc:mysql://localhost:3306/test";
    private static final  String kullaniciAdi="root";
    private static final String sifre ="root";
    
    public Connection  baglan() throws SQLException{
        try{
        Class.forName(driver);
        
        }
        catch(Exception ex){
        ex.printStackTrace();
        
        }
        Connection conn =null;
        conn=DriverManager.getConnection(url,kullaniciAdi,sifre);
        
        return conn;
    
    
    }
}
