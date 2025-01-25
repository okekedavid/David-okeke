public class FlagPatternSingleLoop {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the flag
        int columns = 18; // Total width of the flag

           for (int i = 0; i < rows; i++) {
                StringBuilder rowPattern = new StringBuilder();
    
             for (int j = 0; j < columns; j++) {
               if (j < 5) {
                   rowPattern.append("*"); // Star section
              } else if (j < 13) {
                   rowPattern.append("="); // Equal sign section
              } else {
                   rowPattern.append("*"); // Star section
               }
           }
           // Print the row
          System.out.println(rowPattern);
      }
  }
}