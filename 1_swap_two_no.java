class Main {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        //using third variable
        // int temp = a;
        // a = b;
        // b=temp;

        //without using third variable        
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
