/**
 * class for Jackets that extends the Coats class
 * @author Ben Murphy (ID: 119394463)
 */
public class Jacket extends Coats{
    private static String JACKET_NAME = "Jacket";
    private static Double NUM_UNITS = 2.0;
    private static Fabric JACKET_FABRIC = new Tweed();

    /**
     * initialises the class using preset values and the Coat super class initializer
     */
    public Jacket() {
        super(JACKET_NAME, NUM_UNITS, JACKET_FABRIC);
    }
}
