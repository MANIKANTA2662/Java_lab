import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text (empty line to end input):");
        StringBuilder text = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            text.append(line).append("\n");
        }
        int charCount = text.length();
        int lineCount = text.toString().split("\n").length;

        // Calculate number of words
        int wordCount = text.toString().split("\\s+").length;

        // Display the results
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
