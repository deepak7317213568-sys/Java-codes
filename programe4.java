import java.util.*;
public class programe4 {

//    sum of digits
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers :");
            int n = sc.nextInt();
            int sum = 0;
            int remainder;
            while (n != 0) {
                remainder = n%10;
                sum += remainder;
                n=n/10;

            }
            System.out.println("Sum of digits is :"+sum);
        }
    }

