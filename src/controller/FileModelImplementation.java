package controller;

import java.util.ResourceBundle;

/**
 *
 * @author Irati Garzón
 */
public class FileModelImplementation implements Model {

    private ResourceBundle configFile;
    
    /**
     * Gets the greeting from the file.
     * @return Returns String with the message in the file.
     */
    @Override
    public String getGreeting() {
        configFile = ResourceBundle.getBundle("controller.Config");
        return configFile.getString("MESSAGE");
    }

}
