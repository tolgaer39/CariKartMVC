/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import databaglanti.Baglanti;
import java.sql.*;

/**
 *
 * @author Engineer
 */
public class Sorgular {

   
    
    private static String cariKod;
    private static String sirketAd;
    private static String il;
    private static String sirketTel;
    private static String sirketFax;
    private static String sirketAdres;
    private static Double krediOnDegeri;
    private static String sirketEmail;
    private static Connection baglan;
    private static PreparedStatement prpst;
    private static ResultSet rs;
    
public static String getIl() {
        return il;
    }

    public static void setIl(String il) {
        Sorgular.il = il;
    }
    public static String getCariKod() {
        return cariKod;
    }

    public static void setCariKod(String cariKod) {
        Sorgular.cariKod = cariKod;
    }

    public static String getSirketAd() {
        return sirketAd;
    }

    public static void setSirketAd(String sirketAd) {
        Sorgular.sirketAd = sirketAd;
    }

    public static String getSirketTel() {
        return sirketTel;
    }

    public static void setSirketTel(String sirketTel) {
        Sorgular.sirketTel = sirketTel;
    }

    public static String getSirketFax() {
        return sirketFax;
    }

    public static void setSirketFax(String sirketFax) {
        Sorgular.sirketFax = sirketFax;
    }

    public static String getSirketAdres() {
        return sirketAdres;
    }

    public static void setSirketAdres(String sirketAdres) {
        Sorgular.sirketAdres = sirketAdres;
    }

    public static Double getKrediOnDegeri() {
        return krediOnDegeri;
    }

    public static void setKrediOnDegeri(Double krediOnDegeri) {
        Sorgular.krediOnDegeri = krediOnDegeri;
    }

    public static String getSirketEmail() {
        return sirketEmail;
    }

    public static void setSirketEmail(String sirketEmail) {
        Sorgular.sirketEmail = sirketEmail;
    }

    public static Connection getBaglan() {
        return baglan;
    }

    public static void setBaglan(Connection baglan) {
        Sorgular.baglan = baglan;
    }

    public static PreparedStatement getPrpst() {
        return prpst;
    }

    public static void setPrpst(PreparedStatement prpst) {
        Sorgular.prpst = prpst;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        Sorgular.rs = rs;
    }
 
    public void Ekle(){
    try{
        Baglanti baglan = new Baglanti();
        Connection conn=null;
        baglan.baglan();
        String sorguEkle = "insert  into  carimvc(cariKod,sirketAd,sirketİl,krediOnDegeri,sirketTel,sirketFax,sirketAdres,sirketEmail) VALUES(?,?,?,?,?,?,?)";
        prpst=conn.prepareStatement(sorguEkle);
        prpst.setString(1, Sorgular.getCariKod());
        prpst.setString(2, Sorgular.getSirketAd());
        prpst.setString(3, Sorgular.getIl());
        prpst.setDouble(4, Sorgular.getKrediOnDegeri());
        prpst.setString(5, Sorgular.getSirketTel());
        prpst.setString(6, Sorgular.getSirketFax());
        prpst.setString(7, Sorgular.getSirketAdres());
        prpst.setString(8, Sorgular.getSirketEmail());
        prpst.executeUpdate();
       
    conn.close();
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
     }  
    
    public void Sil(){
 try{
     Baglanti baglan = new Baglanti();
     baglan.baglan();
     Connection conn=null;
     String sorguSil="delete  from  carimvc  where cariKod=?";
     prpst=conn.prepareStatement(sorguSil);
 } 
 catch(Exception ex){
     ex.printStackTrace();
 }
      
    }
    public void Ara(){
    try{
    
    
    }
    catch(Exception ex){
    ex.printStackTrace();
    
    }
    
    
    }

    public void setKrediOnDegeri(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
