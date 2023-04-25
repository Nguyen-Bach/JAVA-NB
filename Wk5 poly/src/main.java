import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Items> listOfItem = new ArrayList<>();

        Items it1 = new Items("flight", 15.55);
        Items it2 = new Items("cost", 12.22);

        listOfItem.add(it1);
        listOfItem.add(it2);

        WesternBooking booking = new WesternBooking(listOfItem);

        System.out.println(booking.bookingSum());
    }
}
