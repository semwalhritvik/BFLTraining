import java.util.Scanner;

public class checkDebugger {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        
        sc.close();

    }

    public static void sum(int a, int b){
        int c = a+b;
        System.out.println("c = " + c);
    }
}
