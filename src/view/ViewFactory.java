package view;

/**
 *
 * @author Irati Garzón, Alex Salinero
 */
public class ViewFactory {
    /**
     * Instances the view.
     * @param type Receives the type of implementation wanted form the file.
     * @return     Returns the implementation.
     */
     public static View getView(String type) {
        switch (type) {
            case "TEXT":
                return new TextViewImplementation();
            case "WINDOW":
                return new WindowViewImplementation();
               
        }
        return null;
    }
}
