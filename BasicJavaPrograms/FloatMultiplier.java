import java.util.Scanner;

public class FloatMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first, second;
        System.out.println("Enter First Number: ");
        first = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        second = sc.nextDouble();
        
        sc.close();

        System.out.println("product =  " + first*second);  
    }
    
}
