package controller;

/**
 *
 * @author Alex Salinero, Irati Garzón
 */
public class ModelFactory {

    /**
     * Instances the model.
     * @param type Receives the type of implementation wanted form the file.
     * @return     Returns the implementation.
     */
    public static Model getModel(String type) {
        switch (type) {
            case "FILE":
                return new FileModelImplementation();
            case "DB":
                return new DBModelImplementation();
        }
        return null;
    }
}
