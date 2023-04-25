import java.util.ArrayList;

public class OtherBooking extends Booking{


    public OtherBooking(ArrayList<Items> itemList) {
        super(itemList);
    }

    @Override
    public double bookingSum() {

        double sum = super.bookingSum();
        return getDiscount().calculatedDiscountedAmount(sum) * 1.1;
    }
    public double calculateTax() {
        double itemSum = super.bookingSum();
        return itemSum * 0.15;
    }
}
