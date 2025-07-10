package Sorting;

import java.util.Scanner;

public class SelectionSortExamScores {

    // Selection sort method
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    // Method to display the array
    public static void display(int[] scores) {
        System.out.println("Sorted Exam Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        int[] scores = new int[n];

        System.out.println("Enter exam scores of " + n + " students:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        selectionSort(scores);

        display(scores);

        scanner.close();
    }
}

