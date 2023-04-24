import java.util.ArrayList;

public class Booking {
    ArrayList<Items> items;



    public void addItem(Items item) {
        items.add(item);
    }

    public double bookingSum() {
        int size = items.size();
        double price = 0;
        for (int i = 0; i < size; i++) {
            price = price + items.get(i).getPrice();
        }
        return price;
    }

    public Booking(ArrayList<Items> items) {
        this.items = items;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}
