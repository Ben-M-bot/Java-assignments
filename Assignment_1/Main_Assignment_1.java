
import java.util.List;
import java.util.ArrayList;
public class Main_Assignment_1 {
    public static void main( final String[] args) {
        final List<Garment> items = new ArrayList<Garment>( );
        T_Shirt shirt = new T_Shirt();
        Jeans jean = new Jeans();
        Rain_Coat rain = new Rain_Coat();
        Jacket jacket = new Jacket();
        Winter_Coat winter = new Winter_Coat();
        items.add(jean);
        items.add(shirt);
        items.add(winter);
        items.add(jacket);
        items.add(rain);

        for (Garment item : items) {
            item.printPurpose( );        }
        System.out.println( );
        for (Garment item : items) {
            item.printItemisedBill( );
            System.out.println();
        }
        Fabric fab = new Polyester();
        System.out.println(fab);
    }
}