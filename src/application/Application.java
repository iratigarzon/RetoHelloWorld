package application;

import controller.Controller;
import controller.ModelFactory;
import java.util.ResourceBundle;
import view.ViewFactory;

/**
 *
 * @author Irati Garzón, Alex Salinero
 */
public class Application {

    private static ResourceBundle configFile;

    /**
     * Main application method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        configFile = ResourceBundle.getBundle("controller.Config");
        new Controller().run(ViewFactory.getView(configFile.getString("VIEW")), ModelFactory.getModel(configFile.getString("MODEL")));
    }

}
