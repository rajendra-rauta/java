public class assignment {

    import java.util.Scanner;

public class GrossPayCalculator {
    // Function to compute pay
    public static double computepay(double hours, double rate) {
        double totalPay;
        if (hours > 40) {
            // Calculate overtime pay
            double overtimeHours = hours - 40;
            double overtimePay = overtimeHours * (rate * 1.5);
            double regularPay = 40 * rate;
            totalPay = regularPay + overtimePay;
        } else {
            // No overtime, just regular pay
            totalPay = hours * rate;
        }
        return totalPay;
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for hours worked and rate per hour
        System.out.print("Enter Hours: ");
        double hours = scanner.nextDouble();

        System.out.print("Enter Rate per Hour: ");
        double rate = scanner.nextDouble();

        // Compute the gross pay
        double pay = computepay(hours, rate);

        // Display the result
        System.out.println("Pay: " + pay);

        // Close the scanner
        scanner.close();
    }
}
 
    
}
