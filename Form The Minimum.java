import java.util.Arrays;

public class Minimum {
    public static int minValue(int[] values) {
        // Sort the array in ascending order
        Arrays.sort(values);

        // Remove duplicates
        int previous = values[0];
        int size = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] != previous) {
                values[size] = values[i];
                previous = values[i];
                size++;
            }
        }

        // Construct the minimum number from the remaining digits
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result * 10 + values[i];
        }

        return result;
    }
}