import java.util.*;
class programe4 {
    public static int prime_number(int num) {
        int temp = 0;
        for (int i = 0; i < num; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }

        }
        if (temp > 0) {
            System.out.println("the number is prime");
        } else {
            System.out.println("this number is not prime");
        }
        return prime_number(num);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        prime_number(num);
    }
}