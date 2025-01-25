public class NigerianFlagPattern {
    public static void main(String[] args) {
        int rows = 6;    // Total number of rows
        int columns = 12; // Total number of columns in the pattern

        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < columns; j++) { // Inner loop for columns
                if (i < 3) { // Top half of the flag
                    if (j < 4) {
                        System.out.print("* "); // First section: stars
                    } else {
                        System.out.print("= "); // Middle and right sections: equal signs
                    }
                } else { // Bottom half of the flag
                    System.out.print("= "); // Entire row contains equal signs
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}