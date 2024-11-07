package StringManipulation;

public class SecondSmallestSalary {
    public static int findingSecondSmallestSalary(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int salary : array) {
            if (salary < smallest) {
                secondSmallest = smallest;
                smallest = salary;
            } else if (salary < secondSmallest && salary != smallest) {
                secondSmallest = salary;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] array = {1000, 2000, 3000, 4000, 5000};
        int salary = findingSecondSmallestSalary(array);
        System.out.println("Second Smallest Number is:" + salary);
    }
}
