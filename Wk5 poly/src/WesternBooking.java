import java.util.ArrayList;

public class WesternBooking extends Booking{


    public WesternBooking(ArrayList<Items> itemList) {
        super(itemList);
    }

    @Override
    public double bookingSum() {
        double sum = super.bookingSum();
        return getDiscount().calculatedDiscountedAmount(sum) * 1.15;
    }

    public double calculateTax() {
        double itemSum = super.bookingSum();
        return itemSum * 0.1;
    }
}
