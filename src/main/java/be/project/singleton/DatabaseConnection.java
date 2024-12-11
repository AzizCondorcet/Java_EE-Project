package be.project.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    private static final String URL = "jdbc:oracle:thin:@//193.190.64.10:1522/XEPDB1"; // chaîne de connexion
    private static final String USERNAME = "STUDENT03_26"; // utilisateur
    private static final String PASSWORD = "AzQueSamJavaJEEOracle746"; // mot de passe

    public static Connection getConnection() throws SQLException {
        // Charger le driver Oracle
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Charger le driver JDBC Oracle
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Oracle JDBC Driver non trouvé", e);
        }

        // Retourner la connexion
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
