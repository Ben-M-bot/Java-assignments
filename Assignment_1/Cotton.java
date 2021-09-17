/**
 * Class for Cotton that extends the Natural class
 * @author Ben Murphy (ID: 119394463)
 */
public class Cotton extends Natural{
    private static final String NAME = "Cotton";
    private static final Double PRICE_PER_UNIT = 2.0;

    /**
     * initialises the cotton class
     */
    public Cotton() {
        super(NAME, PRICE_PER_UNIT);
    }

    /**
     * overrides the abstract method to gice source of the fabric
     * @return the sorce of the fabric
     */
    @Override
    public String getSource() {
        return "made of Gossypium";
    }

    /**
     * What the class will look like when printed
     * @return the representation of the class as a string
     */
    @Override
    public String toString()  {
        final String result = "Cotton made of Gossypium";
        return result;
    }
}
