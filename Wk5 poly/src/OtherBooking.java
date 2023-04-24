import java.util.ArrayList;

public class OtherBooking extends Booking{
    public OtherBooking(ArrayList<Items> items) {
        super(items);
    }



    public double bookingSumOther() {

        return bookingSum() * 1.1;
    }
}
