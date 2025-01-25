public class FlagPatternNestedLoop {
    public static void main(String[] args) {
        int rows = 4;    // Number of rows for the flag
        int columns = 18; // Total width of the flag

        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < columns; j++) { // Inner loop for columns
                if (j < 5) {
                    System.out.print("*"); // First section: stars
                } else if (j < 13) {
                    System.out.print("="); // Middle section: equal signs
                } else {
                    System.out.print("*"); // Last section: stars
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}