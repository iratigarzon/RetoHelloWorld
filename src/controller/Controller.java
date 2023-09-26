package controller;

import view.View;

/**
 *
 * @author Irati Garzón, Alex Salinero
 */
public class Controller {

    View view;
    Model model;

    /**
     * Manages the communication between model and view.
     * @param view Receives a View object.
     * @param model Receives a Model object.
     */
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
}
