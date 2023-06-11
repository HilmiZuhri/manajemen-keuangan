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
import ManKeu.Pengeluaran;
import ManKeu.Koneksi;
import ManKeu.data.UangKeluar;
/**
 *
 * @author user
 */
public class UserController2 {
    
    private UangKeluar user2;
    
    public void setUser(UangKeluar user2){
        this.user2 = user2;
    }
    
    public void Simpan(Pengeluaran view2){
        String idpengeluaran = view2.getTxtidpen().getText();
        String idsaldo = view2.getTxtidsal().getText();
        String jumlah = view2.getTxtjumlah().getText();
        String tanggal = view2.getTxttanggal().getText();
        String keterangan = view2.getTxtketerangan().getText();
        
        if(jumlah.trim().equals("")){
            JOptionPane.showMessageDialog(view2, "Jumlah pemasukan masih kosong!");
        }else if(tanggal.trim().equals("")){
            JOptionPane.showMessageDialog(view2, "Tanggal masih kosong");
        }else if(keterangan.trim().equals("")){
            JOptionPane.showMessageDialog(view2, "Keterangan masih kosong!");
        }else{
            user2.Simpan();
        }
        
        try{
            Connection con = Koneksi.getKoneksi();
            String sql = "INSERT INTO pengeluaran VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, idpengeluaran);
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
