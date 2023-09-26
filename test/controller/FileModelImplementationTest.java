/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author irati
 */
public class FileModelImplementationTest {

    public FileModelImplementationTest() {
    }

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
