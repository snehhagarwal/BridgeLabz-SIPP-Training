import java.util.Scanner;

public class WordLengthCheck {
    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static int[] getMinMaxIndex(String[][] table) {
        int min = 0, max = 0;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < Integer.parseInt(table[min][1])) min = i;
            if (len > Integer.parseInt(table[max][1])) max = i;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);
        int[] res = getMinMaxIndex(table);
        System.out.println("Shortest Word: " + table[res[0]][0]);
        System.out.println("Longest Word: " + table[res[1]][0]);
    }
}

