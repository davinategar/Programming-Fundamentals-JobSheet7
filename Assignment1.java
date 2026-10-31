import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketPrice = 50000;
        int customerCount;
        int quantity;
        int totalTickets = 0;
        int totalRevenue = 0;
        int payment;
        
        System.out.print("Enter number of customers: ");
        customerCount = sc.nextInt();

        for (int i = 1; i <= customerCount; i++) {
            System.out.println("\nCustomer " + i);

            System.out.print("Enter ticket quantity: ");
            quantity = sc.nextInt();

            while (quantity < 0) {
                System.out.println("Invalid quantity! Please enter again.");
                System.out.print("Enter ticket quantity: ");
                quantity = sc.nextInt();
            }
            payment = quantity * ticketPrice;

            if (quantity > 10) {
                payment = payment - (payment * 15 / 100);
            } else if (quantity > 4) {
                payment = payment - (payment * 10 / 100);
            }
            totalTickets += quantity;
            totalRevenue += payment;

            System.out.println("Customer payment: Rp " + payment);
        }

        System.out.println("\n===== DAILY SALES SUMMARY =====");
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.println("Total ticket revenue: Rp " + totalRevenue);
    }
}
