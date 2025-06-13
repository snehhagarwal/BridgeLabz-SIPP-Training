import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        
        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();
        
        String youngest = "Amar"; // Initialize youngest to Amar
        if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) youngest = "Akbar"; // Check if Akbar is youngest
        if (ageAnthony <= ageAmar && ageAnthony <= ageAkbar) youngest = "Anthony"; // Check if Anthony is youngest
        
        String tallest = "Amar"; // Initialize tallest to Amar
        if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) tallest = "Akbar"; // Check if Akbar is tallest
        if (heightAnthony >= heightAmar && heightAnthony >= heightAkbar) tallest = "Anthony"; // Check if Anthony is tallest
        
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }
}
