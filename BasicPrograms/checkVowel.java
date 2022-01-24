import java.util.Scanner;

public class checkVowel {
    public static boolean checkV(char c){
        boolean check;
        switch(c) 
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': check = true;
            break;
            default: check =false;            
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        String c;
        c = sc.next();
        sc.close();

        System.out.print(checkV(c.charAt(0))? "Vowel":"Consonant");
    }
    
}
