package view;

import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Irati Garzón
 */
public class WindowViewImplementation extends javafx.application.Application implements View{
     private static String messag;

     /**
      * Shows the greeting in the window.
      * @param message Receives the message to show.
      */
    @Override
    public void showGreeting(String message) {
        messag = message;
        launch();
    }
    
    /**
     * Start of JavaFX.
     * @param primaryStage Receives the stage.
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        Parent root = loader.load();
        FXMLController viewController = loader.getController();
        viewController.setMessage(messag);
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("/image/macaron.png"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
