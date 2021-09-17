/**
 * Class for Winter coats that extends the Coats class
 * @author Ben Murphy (ID: 119394463)
 */
public class Winter_Coat extends Coats{
    private static String WINTER_NAME = "Winter Coat";
    private static Double NUM_UNITS = 2.5;
    private static Fabric WINTER_FABRIC = new Polyester();

    /**
     * initialises the Winter coat class with preset values and the Coats class initializer
     */
    Winter_Coat() {
        super(WINTER_NAME, NUM_UNITS, WINTER_FABRIC);
    }
}
