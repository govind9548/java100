// swapping of three numbers
class Main {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        //using third variable
        // int temp = a;
        // a = b;
        // b = c;
        // c=temp;

        //without using third variable        
        a = a+b+c;
        b = a-(b+c);
        c = a-(b+c);
        a = a-(b+c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
