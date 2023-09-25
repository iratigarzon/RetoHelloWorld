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
public class FileModelImplementation implements Model {

    private ResourceBundle configFile;

    @Override
    public String getGreeting() {
        configFile = ResourceBundle.getBundle("controller.Config");
        return configFile.getString("MESSAGE");
    }

}
