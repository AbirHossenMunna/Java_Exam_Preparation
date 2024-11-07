package StringManipulation;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void findingVowelConsonants(String inputString) {
        int vowels = 0;
        int consonants = 0;

        for (char ch : inputString.toCharArray()) {
            if (isVowel(ch)) {
                vowels++;
            } else if (Character.isLetterOrDigit(ch)) {
                consonants++;
            }
            System.out.println("Vowels:" + vowels);
            System.out.println("Consonants"  + consonants);
        }
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = scanner.nextLine();

        input = input.toLowerCase();
        findingVowelConsonants(input);
    }
}
