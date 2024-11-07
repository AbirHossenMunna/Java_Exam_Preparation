package StringManipulation;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 1, 2, 4, 5, 6, 4, 6, 7, 3, 8};
        int[] result = Arrays.stream(arrays).distinct().toArray();
        System.out.println("remove duplicate from array:" + Arrays.toString(result));
    }
}
