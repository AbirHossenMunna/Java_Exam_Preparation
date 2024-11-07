package StringManipulation;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch:str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String convert = sb.toString();
        return convert.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str = scanner.nextLine();
        boolean result = checkPalindrome(str);
        System.out.println("Is the given string a palindrome? " + result);
    }
}
