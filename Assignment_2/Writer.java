/**
 * Interface for authors that lets them publish books
 * @author Ben Murphy (ID: 119394463)
 */
public interface Writer extends Person{
    public void publishBook(Book book);

    public void printBooksPublished();
}
