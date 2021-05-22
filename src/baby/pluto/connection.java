package baby.pluto;

/**
 *  @author Baby Pluto
 */

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import javax.swing.JOptionPane;


public class connection {
    Connection conn;
    
    public static Connection ConnecrDb() {
        Path path = Paths.get("RoomBookingDatabase_V1.1.db");
        System.out.println(path.toAbsolutePath());
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/sparshbohra/214-project/resources/RoomBookingDatabase_V1.1.db");
            return conn;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}

