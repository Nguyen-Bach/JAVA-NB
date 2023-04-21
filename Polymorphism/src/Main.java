class bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}

class woodPecker extends bird {
    public void sing() {
        System.out.println("lullllll");
    }
}


public class Main {
   public static void main(String[] args) {
       woodPecker b = new woodPecker();
       b.sing();
   }
}