import java.util.Scanner;

public class IT24103883Lab5Q3 {
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_4_DAYS = 10; // 10% discount
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20; // 20% discount
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Dates must be between 1 and 31.");
            scanner.close();
            return; // Exit program if validation fails
        }

            if (startDate >= endDate) {
            System.out.println("Error: Start date must be before the end date.");
            scanner.close();
            return; // Exit program if validation fails
        }

       int daysReserved = endDate - startDate + 1;
       int totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
       double discount = 0;
        if (daysReserved >= 5) {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        } else if (daysReserved >= 3) {
            discount = DISCOUNT_3_4_DAYS;
        }
        double discountAmount = totalAmount * discount / 100;
        double finalAmount = totalAmount - discountAmount;
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Total amount to be paid: Rs " + finalAmount);

    scanner.close();
    }
}
