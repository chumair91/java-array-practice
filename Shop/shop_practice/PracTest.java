import java.util.Scanner;

public class PracTest {
    public static void main(String[] args) {
        Person1 person=new Person1("Aslam", "as@gmail.com");
        PracShop shop= new PracShop(person,"lahore");
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("enter your choice");
            System.out.println("1 to add");
            System.out.println("2 for sale");
            System.out.println("3 to check");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
             shop.addProduct();
                    break;
            case 2:
            shop.Sale();
            break;
            case 3:
            shop.checkQuantity();
            break;
            case 0:
            System.exit(0);
            break;
                default:
                   
            }
        }
    }
}
