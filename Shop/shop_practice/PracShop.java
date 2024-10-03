
import java.util.Scanner;

public class PracShop {
    private PracProduct product[] = new PracProduct[500];
    private Person1 owner;
    private String address;
    private static int productCount = 0;
    private static double revenue;

    public PracShop(Person1 owner, String address) {
        this.owner = owner;
        this.address = address;
    }

    public void addProduct() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Add product details");
    System.out.println("add product name");
    String name=sc.nextLine();
    System.out.println("add product price");
    double price=sc.nextDouble();
    System.out.println("Enter product quantity");
    int quantity=sc.nextInt();
     product[productCount++]=new PracProduct(name,price,quantity);
     System.out.println("product added");
    }

    public void Sale(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter product id");
        String id=input.nextLine();

        for (int i = 0; i < productCount; i++) {
            if (product[i].getId().equals(id)) {
                product[i].setQuantity(product[i].getQuantity()-1);
                revenue+=product[i].getPrice();
                System.out.println("sale Successful");
            }
            else{
                System.out.println("Sale successful");
            }
        }
    }
  public void checkQuantity(){
    for (int i = 0; i < productCount; i++) {
        System.out.println(product[i].getQuantity());
    }
  }


}
