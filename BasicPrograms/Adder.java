import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first, second;
        System.out.println("Enter First Number: ");
        first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        second = sc.nextInt();
        
        sc.close();

        System.out.println("Addition =  " + (first+second));
    }
}
