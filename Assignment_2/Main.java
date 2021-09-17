public class Main {
    public static void main( final String[] args) {
        Title title = new Title("the Lord of The Rings", "shadows of Mordor");
        Name title1 = new Title("Passengers");
        Name t2 = new Title("Inheritance", "saga");
        Name t1 = new Title("Paladin");
        Author a1 = Author.JRR_Tolkien;
        Author a2 = Author.JD_Sallinger;
        Book b1 = new Paperback(a1, title, 2500);
        Book b2 = new Hardback(a1, title1, 377);
        Book b3 = new Audiobook(a1, t1, 368);
        Book b4 = new Paperback(a2, t2, 644);
        System.out.println(title.getName());
        System.out.println(title1.getName());
        Reader r1 = new Reader("John", "Doe");
        r1.buy(b1);
        r1.receive(100);
        a2.buy(b4);
        a2.receive(200);
        a2.buy(b4);
        r1.buy(b1);
        r1.buy(b2);
        r1.buy(b3);
        r1.printBooksOwned();
        a1.printBooksPublished();
        a2.printBooksOwned();

    }
}
