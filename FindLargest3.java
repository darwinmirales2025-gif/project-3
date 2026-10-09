public class FindLargest {
    public static void main(String[] args) {
        int[] array = {80, 90, 88, 77, 67, 98, 78, 65, 99};
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number in the array: " + max);
    }
}