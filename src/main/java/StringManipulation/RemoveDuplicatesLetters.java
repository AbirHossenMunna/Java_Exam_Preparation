package StringManipulation;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicatesLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Word");
        String input = scanner.nextLine();

        String str = input.toLowerCase();
        String result = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Remove Duplicate Letters:" + result);
    }
}
