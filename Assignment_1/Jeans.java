/**
 * A class for jeans that extends the Trousers class
 * @author Ben Murphy (ID: 119394463)
 */
public class Jeans extends Trousers{
    private static String JEAN_NAME = "Jeans";
    private static Double NUM_UNITS = 2.0;
    private static Fabric JEAN_FABRIC = new Cotton();

    /**
     * initialises the Jeans class using the Trousers initializer
     */
    public Jeans() {
        super(JEAN_NAME, NUM_UNITS, JEAN_FABRIC);
    }
}
