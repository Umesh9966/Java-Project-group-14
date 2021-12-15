import java.awt.Image;
import java.net.URL;
import java.sql.*;
import javax.imageio.ImageIO;

import javax.swing.JOptionPane;

public class getDetails {
	public static Connection getcon() {
        String url = "jdbc:postgresql://localhost/project";
        String user = "postgres";
        String password = "7993322547";
        Connection conn;
        conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception a) {
            JOptionPane.showMessageDialog(null, a.getMessage(), "Failed", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    public static Image geticon(String s) {
        Image manimage = null;
        try {
            URL manurl = new URL(s);
            manimage = ImageIO.read(manurl);
        } catch (Exception e) {
            System.out.println("not able to retrive" + e.getMessage());
        }
        return manimage;
    }
}
