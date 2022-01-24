import java.util.Scanner;
class Num{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num;
        num = sc.nextInt();
        sc.close();

        System.out.println(num);

    }
}