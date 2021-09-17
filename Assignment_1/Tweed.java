/**
 * Class for Tweed that extends the Natural class
 * @author Ben Murphy (ID: 119394463)
 */
public class Tweed extends Natural{

    private static String NAME = "Tweed";
    private static Double PRICE_PER_UNIT = 3.0;
    /**
     * initialises the tweed class
     */
    public Tweed() {
        super(NAME, PRICE_PER_UNIT);
    }

    /**
     * overrides the abstract method to give the source
     * @return the source of the fabric
     */
    @Override
    public String getSource() {
        return "made of Wool";
    }

    /**
     * What the class will look like when printed
     * @return the string representation of the class
     */
    @Override
    public String toString() {
        final String result = "Tweed made of Wool";
        return result;
    }
}
