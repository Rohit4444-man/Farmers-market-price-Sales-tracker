import java.util.Scanner;

public class FarmerMarket {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter crop name: ");
String crop = sc.nextLine();

System.out.print("Enter price per kg: ");
double price = sc.nextDouble();

System.out.print("Enter quantity sold (kg): ");
double quantity = sc.nextDouble();

double total = price * quantity;

System.out.println("\n--- Sales Details ---");
System.out.println("Crop: " + crop);
System.out.println("Price per kg: ₹" + price);
System.out.println("Quantity sold: " + quantity + " kg");
System.out.println("Total Sales: ₹" + total);


}
}