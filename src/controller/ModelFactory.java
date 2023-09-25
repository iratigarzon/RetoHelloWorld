package controller;

/**
 *
 * @author alexs, iratig
 */
public class ModelFactory {

    /**
     * Instances the model.
     *
     * @return returns the file implementation.
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
