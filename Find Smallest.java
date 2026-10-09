public class FindSmallest {
    public static void main(String[] args) {
        int[] array = {80, 90, 88, 77, 67, 98, 78, 65, 99};
        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Smallest number in the array: " + min);
    }
}