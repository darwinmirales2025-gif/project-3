public class FindLargest {
    public static void main(String[] args) {
        int[] numbers = {80, 90, 88, 77, 67, 98, 78, 65, 99};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The largest number is: " + max);
    }
}