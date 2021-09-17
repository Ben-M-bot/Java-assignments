/**
 * Class for garments that contains number of units and fabric its made of
 * @author Ben Murphy (ID: 119394463)
 */
public abstract class Garment {
    private final String name;
    private final Double num_units;
    private final Fabric fabric;

    /**
     * initialises the garment class with three attributes
     * @param name is the name of the garment
     * @param num_units is the number of units of fabric to make the garment
     * @param fabric the type of fabric used to make the garment
     */
    public Garment(final String name, final Double num_units, final Fabric fabric) {
        this.name = name;
        this.num_units = num_units;
        this.fabric = fabric;
    }

    /**
     * Gives you the name of the garment
     * @return A string value that represents the name of the garment
     */
    public String getName() {
        return name;
    }

    public void printPurpose() {
    }

    /**
     * prints the bill of garment including the fabric it is made of and the environmental tax on the fabric if any
     */
    public void printItemisedBill() {
        final Double total_tax = getNum_units() * fabric.getTax();
        final Double base_price = getNum_units() * fabric.getPpu();
        final Double grand_total = base_price + total_tax;

        System.out.println("Itemised bill for " + getName());
        System.out.println("Made of " + getNum_units() + " units of " + fabric);
        System.out.println(" environment tax: " + getNum_units() +
                " * " + fabric.getTax() + " = " + total_tax);
        System.out.println("\t  base price: " + getNum_units() + " * " +
                fabric.getPpu() + " = " + base_price);
        System.out.println("\t grand total: " + base_price + " + "
        + total_tax + " = " + grand_total);
    }

    /**
     * returns the number of units of fabric to make the garment
     * @return a Double value that represents the number of units to make the garment
     */
    public Double getNum_units() {
        return num_units;
    }
}
