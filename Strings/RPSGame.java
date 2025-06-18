import java.util.Scanner;

public class RPSGame {
    public static String getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        return options[(int)(Math.random() * 3)];
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors") || user.equals("scissors") && comp.equals("paper") || user.equals("paper") && comp.equals("rock"))
            return "user";
        return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Games to play: ");
        int n = sc.nextInt();
        int userWin = 0, compWin = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            if (winner.equals("user")) userWin++;
            else if (winner.equals("computer")) compWin++;
            System.out.println("Computer chose: " + comp + " => " + winner.toUpperCase());
        }
        System.out.println("User wins: " + userWin + ", Computer wins: " + compWin);
        double total = userWin + compWin;
        System.out.printf("User %%: %.2f%%, Computer %%: %.2f%%\n", (userWin / total) * 100, (compWin / total) * 100);
    }
}

