public class VoucherDiscount extends Discount{

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

    public VoucherDiscount(String code) {
        super(code);
    }

    @Override
    public double calculatedDiscountedAmount(double sum) {
        if (amount > sum)
            return 0;
        return sum - amount;
    }


}
