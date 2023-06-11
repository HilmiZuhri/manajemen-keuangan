/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManKeu.data;
import ManKeu.event.UserListener;
/**
 *
 * @author user
 */
public class Uangrekap {
    private String idsaldo;
    private String jumlah;
    private String tanggal;
    private String keterangan;
    
    private UserListener userlistener;
    
    public UserListener getUserlistener(){
        return userlistener;
    }
    
    public void setUserlistener(UserListener userlistener){
        this.userlistener = userlistener;
    }

    public String getIdsaldo() {
        return idsaldo;
    }

    public void setIdsaldo(String idsaldo) {
        this.idsaldo = idsaldo;
        fireOnChange();
    }
    
    public String getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(String jumlah){
        this.jumlah = jumlah;
        fireOnChange();
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
        fireOnChange();
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
        fireOnChange();
    }
    
    
    
    protected void fireOnChange(){
        if(userlistener!=null){
            userlistener.onChange((UangMasuk) this);
        }
    }
    
    public void Simpan(){
        
    }
    
    public void Tampilkan(){
        
    }
    
    public void Hapus(){
        
    }
    
}
