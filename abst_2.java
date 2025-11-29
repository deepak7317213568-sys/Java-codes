abstract class birds
 {
    abstract void eat();
    abstract void sound();
    void fly()
    {
        System.out.println("The Birds is flying.");
    }
 }
 class pigeon extends birds
 {
    void sound()
    {
        System.out.println("Pigeon is chirping.");
    }

    void eat()
    {
        System.out.println("The Birds is picking grains.");
    }
 }

 public class abst_2
 {
    public static void main(String[] args)
    {
        birds b=new pigeon();
        b.sound();
        b.eat();
        b.fly();
    }
 }
