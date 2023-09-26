package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Irati Garzón
 */
public class DBModelImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose connection;
    private ResultSet rs;

    /**
     * Calls for message string form config file.
     * @return returns the string found in the config file.
     */
    @Override
    public String getGreeting() {
        String greeting = null;
        final String SelectGreeting = "Select message FROM message";

        try {
            connection = new ConnectionOpenClose();
            con = connection.openConnection();
            stmt = con.prepareStatement(SelectGreeting);
            rs = stmt.executeQuery();

            while (rs.next()) {
                greeting = rs.getString(1);
            }
            connection.closeConnection(stmt, con);
        } catch (SQLException ex) {
            Logger.getLogger(DBModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return greeting;
    }
}
