public class VoucherDiscount extends Discount{
    public VoucherDiscount(String code) {
        super(code);
    }

    private double amount;

    public VoucherDiscount(String code, double amount) {
        super(code);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double calculateDiscountedAmount(Booking booking, double amount) {
        double price;
        if (amount > booking.bookingSum()) {
            price = 0;
        }
        else {
            price = booking.bookingSum() - amount;
        }
        return price;

    }
}
