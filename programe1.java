import java.util.Scanner;

class programe1
{
 public static void addition(int a,int b)
 {
     int sum=a+b;
     System.out.println("the sum is :"+sum);
 }

    public static void main(String[] args) {
        Scanner deepak=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int y=deepak.nextInt();
        System.out.println("Enter the second number :");
        int h =deepak.nextInt();
        addition(y,h);

    }

}
