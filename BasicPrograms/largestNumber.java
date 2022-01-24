import java.util.Scanner;

public class largestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first, second,third;
        System.out.println("Enter First Number: ");
        first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        second = sc.nextInt();
        System.out.println("Enter Third Number: ");
        third = sc.nextInt();
        sc.close();

        if(first>second && first>third){
            System.out.print("First is Largest");
        }
        else if(second>first && second>third){
            System.out.print("Second is largest");
        }
        else if(third>first && third>second){
            System.out.print("Third is largest.");

        }
        else{
            System.out.print("Atleast 2 numbers are largest and equal.");
        }


    }
}
