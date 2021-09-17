/**
 * Class for Synthetic fabris that extends the Fabric class
 * @author Ben Murphy (ID: 119394463)
 */
public abstract class Synthetic extends Fabric{
    private static final Double TAX = 2.0; //All synthetic fabrics have an enivermental tax of 2.0 euro per unit
    /**
     * initialises the class using the Fabric class initializer
     *
     * @param name the name of the fabric
     * @param ppu  the price per unit of the fabric
     */
    public Synthetic(final String name, final Double ppu) {
        super(name, ppu, TAX);
    }
}
