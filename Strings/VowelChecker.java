import java.util.Scanner;

public class VowelChecker {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyCharacters(String text) {
        int n = text.length();
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = text.charAt(i) + "";
            result[i][1] = checkCharType(text.charAt(i));
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        display(classifyCharacters(text));
    }
}

