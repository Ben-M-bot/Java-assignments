/**
 * Class for Natural fabrics that extend the fabric class
 * @author Ben Murphy (ID: 119394463)
 */
public abstract class Natural extends Fabric{
    private static Double TAX = 0.0; //Natural fabric will not suffer environmental tax
    /**
     * initialises the class
     * @param name the name of the fabric
     * @param ppu  the price per unit of the fabric
     */
    public Natural(String name, Double ppu) {
        super(name, ppu, TAX);
    }

    /**
     * natural fabrics have a source
     * @return the source of the natural fabric
     */
    public abstract String getSource();


}
