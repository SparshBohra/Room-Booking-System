package pkg214.project;

/**
 *
 * @author sparshbohra
 */

import java.sql.*;
import javax.swing.JOptionPane;


public class Project {
    Connection conn;
    
    public static Connection ConnecrDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/sparshbohra/Desktop/214-project/RoomBooking.db");
            return conn;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}

