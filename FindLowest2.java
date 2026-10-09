public class FindLowest {
    public static void main(String[] args) {
        int[] numbers = {80, 90, 88, 77, 67, 98, 78, 65, 99};
        int min = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("The lowest number is: " + min);
    }
}