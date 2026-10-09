public class FindLowest {
    public static void main(String[] args) {
        int[] array = {80, 90, 88, 77, 67, 98, 78, 65, 99};

        // Assume the first element is the smallest
        int lowest = array[0];

        // Traverse the array to find the smallest number
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }

        // Print the lowest number
        System.out.println("The lowest number in the array is: " + lowest);
    }
}