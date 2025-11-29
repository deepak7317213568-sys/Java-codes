public class programe11 {
    String name;
    int roll_no;
    void display(){
        System.out.println("the name is :"+name);
        System.out.println("the roll number is :"+roll_no);
    }

    public static void main(String[] args) {
        programe11 obj=new programe11();
        obj.name="Deepak_prajapati";
        obj.roll_no=101;
        obj.display();
    }
}
