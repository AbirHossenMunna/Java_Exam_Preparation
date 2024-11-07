package StringManipulation;

public class HighestSalary {

    public static int findingHighestSalary(int[] array) {
        int highest = Integer.MIN_VALUE;

        for (int salary : array) {
            if (salary > highest) {
                highest = salary;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int array[] = {10000, 12000, 8000, 20000, 15000, 30000, 18000};
        int salary = findingHighestSalary(array);
        System.out.println("Highest Salary is :" + salary);
    }
}
