import java.util.ArrayList;

public abstract class Booking {
    private ArrayList<Items> itemList;

    private Discount discount;

    public Booking(Discount discount) {
        this.discount = discount;
    }

    protected Discount getDiscount() {
        return discount;
    }

    protected void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void addItem(Items item) {
        itemList.add(item);
    }

    public double bookingSum() {
        int size = itemList.size();
        double price = 0;
        for (int i = 0; i < size; i++) {
            price = price + itemList.get(i).getPrice();
        }
        return price;
    }

    public ArrayList<Items> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Items> itemList) {
        this.itemList = itemList;
    }

    public Booking(ArrayList<Items> itemList) {
        this.itemList = itemList;
    }
}
