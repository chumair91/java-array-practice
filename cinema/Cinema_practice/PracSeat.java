public class PracSeat {
    String id;
    boolean isAvailable;
    double price;
    String type;
    public PracSeat(String id, boolean isAvailable, double price, String type) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.price = price;
        this.type = type;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getId() {
        return id;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return String.format("%s %b %.2f %s",id,isAvailable,price,type);
    }
    

}