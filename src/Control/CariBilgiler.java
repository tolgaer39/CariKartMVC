/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Engineer
 */
import Model.Sorgular;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CariBilgiler implements ActionListener{
       Ekran ek;

    public CariBilgiler(Ekran ek) {
       this.ek = ek;
      
       
    }
public void kaydet(Sorgular sorgu){
    try{
    
    sorgu.Ekle();
    }
catch(Exception ex){        
    Logger.getLogger(CariBilgiler.class.getName()).log(Level.SEVERE, null,ex);
    
}
    }


   
    public void actionPerformed(ActionEvent e) {
        kaydet(ek.sorgu);
        
    }

    public void bilgiCek(){
    
    ek.sorgu.setCariKod(ek.txtCariKod.getText());
    ek.sorgu.setSirketAd(ek.txtSirketUnvan.getText());
    ek.sorgu.setIl(ek.txtSirketİl.getText());
    ek.sorgu.setKrediOnDegeri(ek.txtKrediFaiz.getText());
    ek.sorgu.setSirketTel(ek.txtSirketTel.getText());
    ek.sorgu.setSirketFax(ek.txtSirketFax.getText());
    ek.sorgu.setSirketAdres(ek.txtSirketAdres.getText());
    ek.sorgu.setSirketEmail(ek.txtSirketEmail.getText());
    
            
    }
    
}
