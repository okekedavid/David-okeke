import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Declare an array of length 10
        int[] numbers = new int[10];

        // Create a Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);

        // Loop to assign elements to the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print out the input entered by the user using a for-each loop
        System.out.println("\nYou entered the following values:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Close the scanner
        scanner.close();
    }
}