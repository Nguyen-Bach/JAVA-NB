public class PercentOffDiscount extends Discount{
    public PercentOffDiscount(String code) {
        super(code);
    }

    private int percent;

    public PercentOffDiscount(String code, int percent) {
        super(code);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }


}
