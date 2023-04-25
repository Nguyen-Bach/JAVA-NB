public abstract class Discount {
    private String code;

    public Discount(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    abstract public double calculatedDiscountedAmount(double sum);

}
