public class SpecialEventDiscount extends Discount{

    public SpecialEventDiscount(String code) {
        super(code);
    }

    private int value;

    public SpecialEventDiscount(String code, int value) {
        super(code);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public double calculatedDiscountedAmount(double sum) {
        double percentOffAmount = sum * value/100;
        double max = Math.max(value, percentOffAmount);
        if (max > sum)
            return 0;
        return sum - max;
    }
}
