import java.util.Scanner;

//word starting and vowels

public class programe8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String line=sc.nextLine().toLowerCase();
            String [] words=line.split(" ");
            System.out.println("The result are");
            for(String word:words){
                if(word.matches("^[aeiou].*")){
                    System.out.println( "The vowels is availabale in this word="+line);
                }
                else
                {
                    System.out.println("The vowels is not availabale in this word="+line);
                }
            }

        }
    }

