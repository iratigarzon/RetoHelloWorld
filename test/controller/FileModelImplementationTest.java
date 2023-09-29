package controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the FileMOdelImplementation.
 * @author Irati Garzón, Olivia Salinero
 */
public class FileModelImplementationTest {
    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        Model greeting = new FileModelImplementation();
        assertNotNull("NULL", greeting);
        assertEquals("Hello World", greeting.getGreeting());
    }
}
