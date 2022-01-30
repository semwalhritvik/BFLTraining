import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        String ch;
        ch = sc.next();
        sc.close();
        
        int ascii = ch.charAt(0);

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
    
}
