/**
 * Class that creates audiobooks using the interface Audio and a concrete class Book
 * @author Ben Murphy (ID: 119394463)
 */
public class Audiobook implements Audio{
    private final double COST = 15;
    private Book book;
    private final Double len;

    public Audiobook(final Author au, final Name ti, final double len) {
        book = new ConcreteBook(au, ti, COST);
        this.len = len;
        au.publishBook(this);
    }


    @Override
    public Double getLength() {
        return len;
    }

    @Override
    public Double getPrice() {
        return book.getPrice();
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public Author getAuthor() {
        return book.getAuthor();
    }

    @Override
    public String getAuthorName() {
        return book.getAuthorName();
    }

    @Override
    public String toString() {
        final String output = "AudioBook[ author = " + book.getAuthorName() + ", title = " + book.getTitle() +
                ", price = " + book.getPrice() + " euro, length = " + getLength() + " min]";

        return output;
    }
}
