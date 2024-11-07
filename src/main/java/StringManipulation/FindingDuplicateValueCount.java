package StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingDuplicateValueCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("Repeated values is :");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
        scanner.close();
    }
}
