package StringManipulation;

public class SmallestSalary {
    public static int findingSmallestSalary(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int salary : array) {
            if (salary < smallest) {
                smallest = salary;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] array = {10000, 20000, 5000, 30000, 15000};
        int salary = findingSmallestSalary(array);
        System.out.println("Smallest Salary is:" + salary);
    }
}
