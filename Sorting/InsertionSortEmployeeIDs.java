package Sorting;

import java.util.Scanner;

public class InsertionSortEmployeeIDs {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Current element to be inserted
            int j = i - 1;

            // Shift elements of the sorted part that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at the correct position
            arr[j + 1] = key;
        }
    }

    // Method to display the array
    public static void display(int[] arr) {
        System.out.println("Sorted Employee IDs:");
        for (int id : arr) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employee IDs: ");
        int n = scanner.nextInt();
        int[] empIDs = new int[n];

        System.out.println("Enter " + n + " Employee IDs:");
        for (int i = 0; i < n; i++) {
            empIDs[i] = scanner.nextInt();
        }

        insertionSort(empIDs);

        display(empIDs);

        scanner.close();
    }
}

