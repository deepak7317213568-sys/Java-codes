import java.util.Scanner;
public class programe2 {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;

        }
        return fact;
    }

       public static void main(String[] args) {
        Scanner deepak = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = deepak.nextInt();
        int result = factorial(num);
        System.out.println("The factorial is :" + result);
    }
}