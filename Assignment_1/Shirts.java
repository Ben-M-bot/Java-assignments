/**
 * class for shirts that extends the Garment class
 * @author Ben Murphy (ID: 119394463)
 */
public abstract class Shirts extends Garment {
    /**
     *
     * @param name the name of the type of shirt
     * @param num_unit the number of units of fabric to make the shirt
     * @param fabric the tupe of fabric to make the garment/shirt
     */
    public Shirts(String name, Double num_unit, Fabric fabric) {
        super(name, num_unit, fabric);
    }

    /**
     * prints the purpose of the shirt
     */
    @Override
    public void printPurpose() {
        System.out.println(getName() + " cover the body");
    }
}
