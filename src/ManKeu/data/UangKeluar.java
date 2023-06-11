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
import ManKeu.event.UserListener2;
import ManKeu.Pengeluaran;
import ManKeu.Koneksi;

/**
 *
 * @author user
 */
public class UangKeluar extends Uangrekap {
    private UserListener2 userListener2;

    public UserListener2 getUserListener2() {
        return userListener2;
    }

    public void setUserListener2(UserListener2 userListener2) {
        this.userListener2 = userListener2;
    }
    
    @Override
    public void Simpan(){
        
    }
    
    @Override
    public void Tampilkan(){
        
    }
}
