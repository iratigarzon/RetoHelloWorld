/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ResourceBundle;

/**
 *
 * @author irati
 */
public class DBModelImplementation implements Model {
     private ResourceBundle configFile;
    
    /**
     * Calls for message string form config file.
     * @return      returns the string found in the config file.
     */
    @Override
    public String getGreeting() {
        configFile = ResourceBundle.getBundle("controller.Config");
        return configFile.getString("MESSAGE");
        
        /*Single line:
        return ResourceBundle.getBundle("Controller.Config").getString("MESSAGE");
        */
    }
}
