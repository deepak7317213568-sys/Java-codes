public class programe10 {
int add(int a,int b){
    return(a+b);
}
int add(int a,int b,int c){
    return(a+b+c);
}
int add(int a,int b,int c,int d){
    return(a+b+c+d);
}

    public static void main(String[] args) {
        programe10 obj=new programe10();
        System.out.println(obj.add(9,4,3));
        System.out.println(obj.add( 6,4,3));
        System.out.println(obj.add( 6,4,3,2));



    }

}
