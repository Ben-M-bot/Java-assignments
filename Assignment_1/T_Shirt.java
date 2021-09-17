/**
 * Class for t_shirts that has preset values
 * @author Ben Murphy (ID: 119394463)
 */
public class T_Shirt extends Shirts{
    private static String NAME = "T-shirt";
    private static Double UNITS = 1.5;
    private static Fabric FABRIC = new Cotton();

    /**
     * initialises the class using preet values and the initializer from the Shirts class
     */
    public T_Shirt() {
        super(NAME, UNITS, FABRIC);

    }
}
