/**
 * class for the trousers type of garment that explains its purpose and extends the Garment class
 * @author Ben Murphy (ID: 119394463)
 */
public abstract class Trousers extends Garment {
    /**
     * initialises the trousers class using the Garment initialiser
     * @param name the name of the type of trousers
     * @param Num_units the number of units required to make the trousers
     * @param fabric the fabric that the trousers are made of
     */
    public Trousers(final String name, final Double Num_units, final Fabric fabric) {
        super(name, Num_units, fabric);
    }

    /**
     * prints the purpose of the trousers
     */
    @Override
    public void printPurpose() {
        System.out.println(getName() + " cover the legs");
    }


}
