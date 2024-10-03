
import java.util.Objects;

public class PracProduct {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private static int counter = 0;

    public PracProduct(String name, double price, int quantity) {
        this.id = String.format("%03d", ++counter);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public PracProduct(String name, double price) {
        this(name, price, 0);

    }

    public PracProduct(String name) {
        this(name, 0);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void setCounter(int counter) {
        PracProduct.counter = counter;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getCounter() {
        return counter;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // Check if the object is null or of different class
       
     PracProduct product=(PracProduct)o;
     return Objects.equals(id,product.id);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %d ", id, name, price, quantity);
    }

}