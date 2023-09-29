/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author irati
 */
public class DBModelImplementationTest {

    public DBModelImplementationTest() {
    }
   
    /**
     * Test of getGreeting method, of class DBModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        Model greeting = new DBModelImplementation();
        assertNotNull("NULL", greeting);
        assertEquals("Hello World!!", greeting.getGreeting());

    }

}
