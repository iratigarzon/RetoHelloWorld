/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author irati
 */
public class FXMLController {
    @FXML
    private Label label; 

    public void setMessage(String message) {
        label.setText(message);
    }
}
