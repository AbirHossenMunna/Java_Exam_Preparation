package StringManipulation;

public class FindingMissingNumber {
    public static int findMissingNumber(int[]array,int n){
        int arraySum= 0;
        int totalSum= n*(n+1)/2;

        for (int number: array) {
            arraySum+=number;
        }
        return totalSum - arraySum;
    }

    public static void main(String []args){
        int[]array = {1,2,3,5,6};
        int n=array.length+1;
        int missingNumber =findMissingNumber(array,n);
        System.out.println("Missing Number is:"+missingNumber);
    }
}
