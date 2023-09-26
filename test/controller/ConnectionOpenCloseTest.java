/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author irati
 */
public class ConnectionOpenCloseTest {


    public ConnectionOpenCloseTest() {
    }


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
    @Test(expected = java.sql.SQLException.class)
    public void testOpenConnectionFailure() throws SQLException {
        ConnectionOpenClose connection = new ConnectionOpenClose();
        // Configura credenciales incorrectas en config.properties para que la conexión falle
        Connection con = connection.openConnection();
    }

}
