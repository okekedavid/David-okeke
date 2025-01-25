import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        // Example array
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Calculate and print the mean
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        // Calculate and print the median
        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        // Calculate and print the standard deviation
        double stdDev = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate mean
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] array) {
        Arrays.sort(array); // Sort the array
        int n = array.length;
        if (n % 2 == 0) {
            // If even, median is the average of the two middle elements
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            // If odd, median is the middle element
            return array[n / 2];
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }
}