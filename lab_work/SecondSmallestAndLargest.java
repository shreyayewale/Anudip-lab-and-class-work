import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Find the second smallest element
        int secondSmallest = findSecondSmallest(array);
        // Find the second largest element
        int secondLargest = findSecondLargest(array);

        // Display the results
        System.out.println("The second smallest element is: " + secondSmallest);
        System.out.println("The second largest element is: " + secondLargest);

        // Close the scanner
        scanner.close();
    }

    public static int findSecondSmallest(int[] array) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = value;
            } else if (value < secondSmallest && value != firstSmallest) {
                secondSmallest = value;
            }
        }

        return secondSmallest;
    }

    public static int findSecondLargest(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = value;
            } else if (value > secondLargest && value != firstLargest) {
                secondLargest = value;
            }
        }

        return secondLargest;
    }
}

