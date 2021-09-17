/**
 * class for fabrics that contains the name of the fabric and how much it costs per unit
 * @author Ben Murphy (ID: 119394463)
 */
public abstract class Fabric {
    private final String name;
    private final Double ppu; // The price per unit of the fabric
    private final Double tax; // The environmental tax of the fabric per unit

    /**
     * initialises the class
     * @param name the name of the fabric
     * @param ppu the price per unit of the fabric
     */
    public Fabric(final String name, final Double ppu, final Double tax) {
        this.name = name;
        this.ppu = ppu;
        this.tax = tax;
    }

    /**
     * Gives the name of the fabric
     * @return the name of the fabric
     */
    public String getName() {
        return name;
    }

    /**
     * Gives the price per unit of the fabric
     * @return the ppu as a Double
     */
    public Double getPpu() {
        return ppu;
    }

    /**
     * Gets the environmental tax for the fabric per unit
     * @return the tax for one unit
     */
    public Double getTax() {
        return tax;
    }

    /**
     * Uses the name of the fabric to represent the class
     * @return the name of the class in string
     */
    @Override
    public String toString() {
        final String result = getName();
        return result;
    }
}
