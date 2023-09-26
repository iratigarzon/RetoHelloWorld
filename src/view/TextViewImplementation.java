package view;

/**
 *
 * @author Irati Garzón
 */
public class TextViewImplementation implements View {

    /**
     * Prints the message through the console/terminal.
     * @param message Received message to print.
     */
    @Override
    public void showGreeting(String message) {
       System.out.println(message);
    }
    
}
