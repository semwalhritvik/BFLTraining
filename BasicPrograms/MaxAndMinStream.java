import java.util.Arrays;

public class MaxAndMinStream {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);  // 10
        int max1 = Arrays.stream(numbers).reduce(0, Integer::max);            // 10
        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);  // 0
        System.out.println(max+ " " + max1+""+ min);
    
    }
    
}
