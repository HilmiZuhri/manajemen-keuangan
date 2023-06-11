/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManKeu.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ManKeu.event.UserListener;
import ManKeu.Pemasukan;
import ManKeu.Koneksi;
/**
 *
 * @author user
 */
public class UangMasuk extends Uangrekap{
    private UserListener userListener;
    
    public UserListener getUserListener(){
        return userListener;
    }
    
    public void setUserListener(UserListener userListener){
        this.userListener = userListener;
    }
    
    @Override
    public void Simpan(){
        //JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
    }
    
    @Override
    public void Tampilkan(){
        try{
            Pemasukan pm = new Pemasukan();
            
            String sql = "SELECT * FROM pemasukan WHERE id_masuk ='" + pm.getTxtjumlah().getText() + "'";
            Connection con = (Connection) Koneksi.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    
}
