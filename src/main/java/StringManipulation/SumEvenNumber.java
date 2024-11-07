package StringManipulation;

public class SumEvenNumber {
    public static int evenNumberSum(int number){
        int sum = 0;
        for (int i=0; i<=number;i++){
            if(i % 2 == 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String []args){
        int number = 10;
        int sum = evenNumberSum(number);
        System.out.println("Sum of even numbers from 1 to " + number + " is: " + sum);
    }
}
