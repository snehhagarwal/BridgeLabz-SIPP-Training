import java.util.Scanner;

public class VowelConsonantCount {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharType(text.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] count = countVC(text);
        System.out.println("Vowels: " + count[0] + ", Consonants: " + count[1]);
    }
}