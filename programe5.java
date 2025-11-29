import java.util.*;
public class programe5 {
    //addition of first and last digits

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the numbers :");
            int n=sc.nextInt();
            int first=0;
            int last;
            last=n%10;
            while(n!=0) {
                first = n % 10;
                n = n / 10;

            }
            System.out.println("the result ="+(first+last));
        }

    }

