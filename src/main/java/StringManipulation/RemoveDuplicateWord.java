package StringManipulation;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWord {
    public static String removeDuplicate(String input){
        // Split the input string into words based on spaces
        String[] words = input.split(" ");

        // Use a LinkedHashSet to preserve the order and remove duplicates
        Set<String> uniqueWords = new LinkedHashSet<>();

        // Add each word to the Set (duplicates will be automatically removed)
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Join the words back into a single string, separated by spaces
        return String.join(" ", uniqueWords);
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = scanner.nextLine();
//        String input ="testing is important testing";

        String result = removeDuplicate(input);
        System.out.println(result);
    }
}
