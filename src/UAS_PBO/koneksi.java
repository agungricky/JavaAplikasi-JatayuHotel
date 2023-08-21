package UAS_PBO;

import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    
    Connection con;
    Statement st;
    ResultSet rs;
    public void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jatayu_hotel", "root", "");
            st=con.createStatement();
        } catch (Exception e) {
        }
    }
}
