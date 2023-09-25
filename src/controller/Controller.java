/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.View;

/**
 *
 * @author irati
 */
public class Controller {

    View view;
    Model model;

    /**
     * Manages the communication between model and view.
     *
     * @param view
     * @param model
     */
    /**
     * Gets the message from the data side and calls for show function.
     */
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
}
