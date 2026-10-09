import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletet {
    public static void main(String[] args) {
        int[] array = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index to delete (0 to " + (array.length - 1) + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position!");
        } else {
            int deletedElement = array[position];
            int[] newArray = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != position) {
                    newArray[j++] = array[i];
                }
            }

            System.out.println("Deleted Element: " + deletedElement);
            System.out.println("Updated Array: " + Arrays.toString(newArray));
        }
        scanner.close();
    }
}