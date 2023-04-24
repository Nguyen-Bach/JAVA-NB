import java.util.ArrayList;

public class WesternBooking extends Booking{

    public WesternBooking(ArrayList<Items> items) {
        super(items);
    }



    public double bookingSumWest() {

        return bookingSum() * 1.15;
    }
}
