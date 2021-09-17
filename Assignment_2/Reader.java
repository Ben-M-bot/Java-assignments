import java.util.*;

/**
 * Class for readers that allows them to buy books and store them in an array
 * @author Ben Murphy (ID: 119394463)
 */
public class Reader implements Person{
    private double money = 0;
    private final String fname;
    private final String lname;
    private ArrayList<Book> ownedBooks;

    public Reader(final String firstname, final String surname) {
        fname = firstname;
        lname = surname;
        ownedBooks = new ArrayList<Book>();
    }

    @Override
    public Double getEarnings() {
        return money;
    }

    @Override
    public String getName() {
        final String output = fname + " " + lname;
        return output;
    }

    @Override
    public void receive(double earnings) {
        money += earnings;
    }

    @Override
    public void charge(double cost) {
        money -= cost;
    }

    @Override
    public void buy(Book book) {
        if (money >= book.getPrice()) {
            charge(book.getPrice());
            Author a1 = book.getAuthor();
            ownedBooks.add(book);
            a1.receive(book.getPrice() * 0.1);

        } else {
            System.out.println("You don’t have enough money to buy");
            System.out.println(book);
        }
    }

    @Override
    public void printBooksOwned() {
        System.out.println(getName() + " owns: ");
        for (int i = 0; i < ownedBooks.size(); i ++) {
            System.out.println(ownedBooks.get(i).getTitle());
        }
    }

}
