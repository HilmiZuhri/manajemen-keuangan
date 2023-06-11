/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManKeu.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ManKeu.Pemasukan;
import ManKeu.Koneksi;
import ManKeu.data.UangMasuk;
/**
 *
 * @author user
 */
public class UserController {
    
    private UangMasuk user;

    public void setUser(UangMasuk user) {
        this.user = user;
    }
    
    public void Simpan(Pemasukan view){
        String idpemasukan = view.getTxtidpem().getText();
        String idsaldo = view.getTxtidsal().getText();
        String jumlah = view.getTxtjumlah().getText();
        String tanggal = view.getTxttanggal().getText();
        String keterangan = view.getTxtketerangan().getText();
        
        if(jumlah.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Jumlah pemasukan masih kosong!");
        }else if(tanggal.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Tanggal masih kosong!");
        }else if(keterangan.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Keterangan masih kosong");
        }else{
            user.Simpan();
        }
        
        try{
            Connection con = Koneksi.getKoneksi();
            String sql = "INSERT INTO pemasukan VALUES (?, ?, ?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, idpemasukan);
            p.setString(2, idsaldo);
            p.setString(3, jumlah);
            p.setString(4, tanggal);
            p.setString(5, keterangan);
            p.executeUpdate();
            p.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error!" + e.getMessage());
        }
    }
}
