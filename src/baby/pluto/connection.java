package baby.pluto;

/**
 *  @author Baby Pluto
 */

import java.sql.*;
import javax.swing.JOptionPane;


public class connection {
    Connection conn;
    
    public static Connection ConnecrDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/sparshbohra/Desktop/214/214-project/RoomBookingDatabase.db");
            return conn;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}

