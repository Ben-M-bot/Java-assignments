/**
 * Interface for a person who interacts with books
 * @author Ben Murphy (ID: 119394463)
 */
public interface Person {

    public void buy(final Book book);

    public void receive(final double earnings);

    public void charge(final double cost);

    public void printBooksOwned();

    public Double getEarnings();

    public String getName();

}
