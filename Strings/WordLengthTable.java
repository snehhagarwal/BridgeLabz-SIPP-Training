import java.util.Scanner;

public class WordLengthTable {
    public static String[] splitWords(String text) {
        int len = text.length(), spaceCount = 0;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') spaceCount++;
        String[] words = new String[spaceCount + 1];
        int index = 0, start = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = getWordLengthTable(words);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}

