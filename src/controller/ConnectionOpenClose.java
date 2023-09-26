package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Irati Garzón
 */
class ConnectionOpenClose {

    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;
    
    /**
     * CONSTRUCTOR
     * Method to open connection with MySQL, gets the info from config.properties file,
     * receives an int to choose the user to connect with
     */
    public ConnectionOpenClose() {
        configFile = ResourceBundle.getBundle("controller.Config");
        url = configFile.getString("URL");
        user = configFile.getString("USER");
        pass = configFile.getString("PASSWORD");
    }

    /**
     * Method that opens the connection with MySQL
     * @return                 Returns the connection with MySQL
     * @throws SQLException 
     */
    public Connection openConnection() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return con;
    }

    /**
     * Method that closes the connection with MySQL
     * @param stmt          
     * @param con           MySQL connection parameter.
     * @throws SQLException 
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }
}