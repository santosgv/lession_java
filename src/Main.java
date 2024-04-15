import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product Product = new Product();
        System.out.println("Entre product Data: ");
        System.out.print("Name: ");
        Product.name =sc.nextLine();
        System.out.print("Price: ");
        Product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        Product.quantity = sc.nextInt();

        System.out.println();
        System.out.print("Product data: " + Product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        Product.addProducts(quantity);

        System.out.println();
        System.out.print("Updated data: " + Product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        Product.removeProducts(quantity);


        System.out.println();
        System.out.print("Updated data: " + Product);






        sc.close();
    }
}