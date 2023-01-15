package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    private static final String url = "jdbc:mysql://localhost:3306/dbres";
    private static final String user = "root";
    private static final String password = "";
    private static Connection con = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" errur de chargement du pilote");

        }
    }

    public static Connection getCon() {
        return con;
    }
}
