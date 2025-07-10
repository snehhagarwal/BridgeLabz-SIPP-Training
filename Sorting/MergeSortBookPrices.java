package Sorting;

import java.util.Scanner;

public class MergeSortBookPrices {

    // Function to merge two sorted halves
    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = prices[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = prices[mid + 1 + j];
        }

        // Merge temp arrays
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k] = leftArr[i];
                i++;
            } else {
                prices[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k++] = leftArr[i++];
        }
        while (j < n2) {
            prices[k++] = rightArr[j++];
        }
    }

    // Recursive merge sort function
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(prices, left, mid);

            // Sort right half
            mergeSort(prices, mid + 1, right);

            // Merge sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Function to display array
    public static void display(int[] arr) {
        System.out.println("Sorted Book Prices:");
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter " + n + " book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        mergeSort(prices, 0, n - 1);

        display(prices);

        scanner.close();
    }
}

