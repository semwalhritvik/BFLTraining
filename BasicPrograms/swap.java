import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int first;
        first = sc.nextInt();
        System.out.println("First Number: " + first);

        System.out.println("Enter Second Number: ");
        int second;
        second = sc.nextInt();
        System.out.println("Second Number: " + second);
        sc.close();

        int temp;
        temp = first;
        first = second;
        second = temp;
        System.out.println("After Swap");
        System.out.println("First Number: " + first);
        System.out.println("Second Number: " + second);

    }
    
}
