import java.util.Scanner;

public class EvenOdd {
    public static boolean eod(int n){
        return n%2==0 ? true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int m;
        m = sc.nextInt();
        sc.close();

        System.out.print(eod(m)? "even":"odd");
    }
    
}
