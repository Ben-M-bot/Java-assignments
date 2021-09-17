/**
 * Class for paperback books that contains its title, author and length and price
 * @author Ben Murphy (ID: 119394463)
 */
public class Paperback implements Paper{
    private final double COST = 10;
    private Book book;
    private final Integer len;

    public Paperback(final Author au, final Name ti, final Integer len) {
        book = new ConcreteBook(au, ti, COST);
        this.len = len;
        au.publishBook(this);
    }

    @Override
    public Integer getLength() {
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
        final String output = "PaperBack[ author = " + book.getAuthorName() + ", title = " + book.getTitle() +
                ", price = " + book.getPrice() + " euro, length = " + getLength() + " pages]";

        return output;
    }
}
