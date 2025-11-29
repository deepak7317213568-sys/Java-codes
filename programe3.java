import java.util.Scanner;

public class programe3 {
    public static void evenoddnumber(int num){
        if(num%2==0)
        {
            System.out.println("The number is even " + num);
        }else{
            System.out.println("The number is odd " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num= sc.nextInt();
        evenoddnumber(num);
    }
}
