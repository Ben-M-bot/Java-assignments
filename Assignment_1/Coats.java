/**
 * class for coats which extends the garment class
 * @author Ben Murphy (ID: 119394463)
 */
public abstract class Coats extends Garment{

    /**
     * initialises the Coats class using the inialiser from the Garment class
     * @param name the name of the type of coat
     * @param num_units the number of units of fabric to make the coat
     * @param fabric the type of fabric used to make the coat
     */
    public Coats(String name, Double num_units, Fabric fabric) {
        super(name, num_units, fabric);
    }

    /**
     * prints out the purpose of the coat
     */
    @Override
    public void printPurpose() {
        System.out.println(getName() + " provides extra protection against the elements");
    }
}
