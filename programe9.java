import java.util.Scanner;

public class programe9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int sum=0;
        int average=0;
        System.out.println("Size of array :");
        int size=sc.nextInt();
        System.out.println("enter the element :");
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        {

          arr[i]=sc.nextInt();
          sum+=arr[i];
          average=sum/size;



        }
        System.out.println("element in array are :");
            for(int i=0;i<size;i++)
            {
                System.out.println(arr[i]+" ");


            }
        System.out.println("the sum is :"+sum);
        System.out.println("the average is "+average);



    }
}
