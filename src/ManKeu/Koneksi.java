package ManKeu;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.SQLException;
public class Koneksi {
    private static java.sql.Connection koneksi;
    
   public static java.sql.Connection getKoneksi() throws SQLException{
        String db = "jdbc:mysql://localhost:3306/mankeu";
        String user = "root";
        String pass = "";
        
        if(koneksi == null){
            koneksi = DriverManager.getConnection(db, user, pass);
        }
        return koneksi;
    }
}
