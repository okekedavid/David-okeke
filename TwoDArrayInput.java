import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] matrix = new int[10][10];

        // Create a Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);

        // Assign elements to the 2D array using a nested loop
        System.out.println("Enter values for a 10x10 matrix:");
        for (int i = 0; i < 10; i++) { // Outer loop for rows
            for (int j = 0; j < 10; j++) { // Inner loop for columns
                System.out.print("Enter value for element at index [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print out the values entered by the user using a for-each loop
        System.out.println("\nThe values entered in the 10x10 matrix are:");
        for (int[] row : matrix) { // For each row in the matrix
            for (int value : row) { // For each value in the row
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Close the scanner
        scanner.close();
    }
}