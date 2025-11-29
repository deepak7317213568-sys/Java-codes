import java.sql.SQLOutput;
import java.util.Scanner;

//pallindrome

public class programe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.nextLine();
        String rev = new StringBuffer(a).reverse().toString();
        if (a.equals(rev)) {
            System.out.println("the string is palindrome=" + rev);

        } else {
            System.out.println("the string is not palindrome=" + rev);
        }

    }
}


