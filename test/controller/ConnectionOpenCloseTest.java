package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the ConnectionOpenClose.
 * @author Irati Garzón, Olivia Salinero
 */
public class ConnectionOpenCloseTest {

    /**
     * Tests if the connection to the DB opens and closes properly.
     */
   @Test
    public void testOpenCloseConnection() {
        try {
            ConnectionOpenClose connection = new ConnectionOpenClose();
            Connection con = connection.openConnection();
            assertNotNull(con);
            con.close();
        } catch (SQLException e) {
            fail("Expected successful connection, but got SQLException: " + e.getMessage());
        }
    }
    /**
     * Provokes an SQLException.
     * @throws SQLException when connection parameters are incorrect.
     */
     @Test(expected = java.sql.SQLException.class)
    public void testOpenConnectionFailure() throws SQLException {
        ConnectionOpenClose connection = new ConnectionOpenClose();
        Connection con = connection.openConnection();
        con = DriverManager.getConnection("0", "0", "0");
    }

}
