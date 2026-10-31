import java.util.Scanner;

public class CafeDoWhileAttendance07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, bread, totalPrice;
        String customerName;

        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;

        do {
            System.out.print("Enter custommer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();

            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            System.out.print("Coffee quantity: ");
            coffee = sc.nextInt();

            System.out.print("Tea quantity: ");
            tea = sc.nextInt();

            System.out.print("Bread quantity: ");
            bread =  sc.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);

            System.out.println("Total amount to pay: Rp " + totalPrice);

            sc.nextLine();
        } while (true);

        System.out.println("All trasactions completed.");
    }
}
