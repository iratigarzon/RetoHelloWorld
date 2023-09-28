
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DBModelImplementation is an implementation of the Model interface that interacts
 * with a database to retrieve a greeting message.
 * @author Irati Garzón, Olivia Salinero 
 */
public class DBModelImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose connection;
    private ResultSet rs;

    /**
     * Retrieves a greeting message from the database.
     *
     * @return The greeting message obtained from the database.
     */
    @Override
    public String getGreeting(){
        String greeting = null;
        final String SelectGreeting = "Select message FROM message";

        try {
            //Opens the connection
            connection = new ConnectionOpenClose();
            con = connection.openConnection();
            //Prepare the statement
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
