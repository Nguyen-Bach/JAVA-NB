public class SpecialEventDiscount extends Discount{
    public SpecialEventDiscount(String code) {
        super(code);
    }
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SpecialEventDiscount(String code, int value) {
        super(code);
        this.value = value;
    }

    public double calculateDiscountedAmount(Booking booking, int value) {
        double price;
        if (value > 100 || value < 1) {
            System.out.println("invalid percent value");

        }

        price =
    }
}
