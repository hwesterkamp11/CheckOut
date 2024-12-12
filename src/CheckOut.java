import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalCost = 0;
        boolean moreItems;
        System.out.println("Everything in the store is $10.");
        do {
            double itemPrice = SafeInput.getRangedDouble(scan, "Enter the price of your item, $.50-$10", .50, 10.00);
            totalCost = totalCost + itemPrice;
            moreItems = SafeInput.getYNConfirm(scan, "Do you have more items");
        } while(moreItems);
        System.out.printf("Your total cost is: $%.2f%n", totalCost);
    }
}
