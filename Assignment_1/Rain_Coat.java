/**
 * a class for Rain coats that extends the Coats class
 * @author Ben Murphy (ID: 119394463)
 */
public class Rain_Coat extends Coats{
    private static String RAIN_NAME = "Rain coat";
    private static Double NUM_UNITS = 2.5;
    private static Fabric RAIN_FABRIC = new Acrylic();

    /**
     * initialises the Rain coat class using preset values and the Coats class initializer
     */
    public Rain_Coat() {
        super(RAIN_NAME, NUM_UNITS, RAIN_FABRIC);
    }
}
