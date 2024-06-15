import java.util.Scanner;

public class DescendingOrderSort {

    int a[] = new int[5]; // Array declaration
    int i, j, temp; // Added declaration for temp variable
    Scanner sc = new Scanner(System.in);

    // Method to accept input from user
    public void accept() {
        System.out.println("Enter five numbers: "); // Prompt for user input
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }

    // Method to sort array in descending order
    public void sort() {
        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) { // Change the comparison for descending order
                    temp = a[i]; // Assign temp variable before using it
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    // Method to display the sorted elements
    public void display() {
        System.out.println("The sorted elements in descending order are: ");
        for (i = 0; i < 5; i++) { // Corrected the for loop syntax
            System.out.println(a[i]);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        DescendingOrderSort obj = new DescendingOrderSort();
        obj.accept();
        obj.sort();
        obj.display();
    }
}
