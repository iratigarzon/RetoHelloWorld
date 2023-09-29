package controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for DBModelIMplementation
 * @author Irati Garzón, Alex Salinero
 */
public class DBModelImplementationTest {
   
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
