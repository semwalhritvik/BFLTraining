import java.util.Scanner;

public class LeapCheck {
    public static boolean leap(int n){
        return (n%4==0 && n%100==0 && n%400==0) || (n%4==0 && n%100!=0) ? true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year;
        year = sc.nextInt();
        sc.close();

        System.out.print(leap(year)? "leap year":"not leap year");
    }
}
