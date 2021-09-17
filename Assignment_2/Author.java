import java.util.*;

/**
 * Enumerated class for authors that also uses an instance of the reader class
 * @author Ben Murphy (ID: 119394463)
 */
public enum Author implements Writer{
    JRR_Tolkien("JRR", "Tolkien"),
    JD_Sallinger("JD", "Sallinger");

    private final String fname;
    private final String lname;
    private Reader writer;
    private ArrayList<Book> publishedBooks;

    /**
     * the constructor for the constants in the enumerated class
     * @param fname the first name of the author
     * @param lname the last name/surname of the author
     */
    private Author(final String fname, final String lname) {
        writer = new Reader(fname, lname);
        this.fname = fname;
        this.lname = lname;
        publishedBooks = new ArrayList<Book>();
    }

    @Override
    public String getName() {
        return writer.getName();
    }

    @Override
    public void publishBook(Book book) {
        publishedBooks.add(book);
    }

    @Override
    public void charge(double cost) {
        writer.charge(cost);
    }

    @Override
    public void receive(double earnings) {
        writer.receive(earnings);
    }

    @Override
    public void buy(Book book) {
        writer.buy(book);
    }

    @Override
    public void printBooksOwned() {
        writer.printBooksOwned();
    }

    @Override
    public void printBooksPublished() {
        System.out.println(getName() + " published: ");
        for (int i = 0; i < publishedBooks.size(); i ++) {
            System.out.println(publishedBooks.get(i).getTitle());
        }
    }

    @Override
    public Double getEarnings() {
        return writer.getEarnings();
    }
}
