package StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingDuplicateValue {
    public static void findingDuplicate(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.print("Duplicate values: ");
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.print(c + "");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        findingDuplicate(input);
    }
}
