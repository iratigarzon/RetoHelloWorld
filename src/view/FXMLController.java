package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author Irati Garzón
 */
public class FXMLController {
    @FXML
    private Label label; 

    /**
     * Sets de message in the window.
     * @param message Received message to show.
     */
    public void setMessage(String message) {
        label.setText(message);
    }
}
