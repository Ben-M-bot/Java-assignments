/**
 * Class for hardback books
 * @author Ben Murphy (ID: 119394463)
 */
public class Hardback implements Paper{
    private final double COST = 12;
    private Book book;
    private final Integer len;

    public Hardback(final Author au, final Name ti, final Integer len) {
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
        final String output = "HardBack[ author = " + book.getAuthorName() + ", title = " + book.getTitle() +
                ", price = " + book.getPrice() + " euro, length = " + getLength() + " min]";

        return output;
    }
}

