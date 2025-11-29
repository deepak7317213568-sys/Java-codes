  import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first value :");
        int value1=sc.nextInt();
        System.out.println("Enter a second value :");
        int value2=sc.nextInt();
        value1=value1+value2;
        value2=value1-value2;
        value1=value1-value2;
        System.out.println("After swapping the: value1="+value1+",value2="+value2);


    }
}
