public class question {

    import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        // Loop until the user enters a valid positive integer
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Calculate the sum of the digits
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10; // Extract the last digit and add it to sum
            temp /= 10;       // Remove the last digit
        }

        // Print the result
        System.out.println("The sum of the digits is: " + sum);
    }
}

    
}
