import java.util.ArrayList;

public class SocialBooking extends Booking{


    public SocialBooking(ArrayList<Items> itemList) {
        super(itemList);
    }

    public double bookingSum() {
        double sum = super.bookingSum();
        return getDiscount().calculatedDiscountedAmount(sum) * 1.05;
    }
}
