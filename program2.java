import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter a second number :");
        float num2 = sc.nextFloat();
        System.out.println("Enter a third number :");
        float num3 = sc.nextFloat();
        float sum = 0;
        float Average = 0;
        sum = num1 + num2 + num3;
        Average = (num1 + num2 + num3) / 3;
        System.out.println("The sum of this number :" + sum);
        System.out.println("The average of this number :" + Average);
    }
}
