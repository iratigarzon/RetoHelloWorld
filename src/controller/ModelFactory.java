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
            case "1":
                return new FileModelImplementation();
            case "2":
                return new DBModelImplementation();
        }
        return null;
    }
}
