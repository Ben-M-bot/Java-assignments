public class ConcreteBook implements Book{
    private final double cost;
    private final Author au;
    private final Name ti;

    public ConcreteBook(final Author au, final Name ti, final Double cost) {
        this.au = au;
        this.ti = ti;
        this.cost = cost;
    }

    @Override
    public Double getPrice() {
        return cost;
    }

    @Override
    public String getTitle() {
        return ti.getName();
    }

    @Override
    public Author getAuthor() {
        return au;
    }

    @Override
    public String getAuthorName() {
        return au.getName();
    }
}
