public class FindLargest {
    public static void main(String[] args) {
        int[] array = {80, 90, 88, 77, 67, 98, 78, 65, 99};

        // Assume the first element is the largest
        int largest = array[0];

        // Traverse the array to find the largest number
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Print the largest number
        System.out.println("The largest number in the array is: " + largest);
    }
}