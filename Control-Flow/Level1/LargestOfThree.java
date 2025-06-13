import java.util.Scanner;


// Program to check which number is the largest among three
class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the largest
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        // Check if the second number is the largest
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        // Check if the third number is the largest
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);

        // Print results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        sc.close();
    }
}

