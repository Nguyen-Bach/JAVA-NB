public class PercentOffDiscount extends Discount{

    private int value;

    public PercentOffDiscount(String code, int value) {
        super(code);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public PercentOffDiscount(String code) {
        super(code);
    }

    @Override
    public double calculatedDiscountedAmount(double sum) {
        return sum - sum * (value/100);
    }
}
