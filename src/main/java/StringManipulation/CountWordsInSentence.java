package StringManipulation;

import java.util.Scanner;

public class CountWordsInSentence {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        String [] words = input.trim().split("\\S+");
        System.out.println(""+words.length);
    }
}
