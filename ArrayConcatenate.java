import java.util.Arrays;

public class ArrayConcatenatet {
    public static void main(String[] args) {
        int[] array1 = {0, 9, 1, 7, 7, 6};
        int[] array2 = {1, 8, 0, 1, 2};

        // Concatenating arrays
        int[] concatenatedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, concatenatedArray, 0, array1.length);
        System.arraycopy(array2, 0, concatenatedArray, array1.length, array2.length);

        // Display the concatenated array
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }
}