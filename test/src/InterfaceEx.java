
interface WaterBottle {
    String color = "blue";

    void fill();
    void pour();

}


public class InterfaceEx implements WaterBottle{
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceEx ex = new InterfaceEx();
        ex.fill();
        ex.pour();
    }

    @Override
    public void fill() {
        System.out.println("fill with water");
    }

    @Override
    public void pour() {
        System.out.println("pour");
    }
}