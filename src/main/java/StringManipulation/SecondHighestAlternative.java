package StringManipulation;

import java.util.Arrays;

public class SecondHighestAlternative {
    public static int findingSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int salary : array) {
            if (salary > highest) {
                secondHighest = highest;
                highest = salary;
            } else if (salary > secondHighest && salary != highest) {
                secondHighest = salary;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] array = {10000, 20000, 30000, 25000, 15000};
        int salary = findingSecondHighest(array);
        System.out.println("The SecondHighest Number is:" + salary);
    }
}
