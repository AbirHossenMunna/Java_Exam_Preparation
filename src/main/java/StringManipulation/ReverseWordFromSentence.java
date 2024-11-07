package StringManipulation;

import java.util.Scanner;

public class ReverseWordFromSentence {
    public static String reverseWord(String input) {
        String[] words = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        String result = reverseWord(input);
        System.out.println(result);
    }
}
