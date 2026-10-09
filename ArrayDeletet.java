import java.util.Scanner;

public class ArrayDeletet {
    public static void main(String[] args) {
        int[] array = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};
        Scanner sc = new Scanner(System.in);

        // Display the original array
        System.out.print("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Asking user for the index to delete
        System.out.print("Enter the index to delete (0 to " + (array.length - 1) + "): ");
        int index = sc.nextInt();

        // Check if index is valid
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index! Exiting program.");
            return;
        }

        // Store the deleted element
        int deletedElement = array[index];

        // Shift elements to the left
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Display the updated array
        System.out.print("Updated Array after deletion: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nDeleted Element: " + deletedElement);
        
        sc.close();
    }
}