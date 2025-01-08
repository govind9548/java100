// Fibonacci Series
// T.C  ---> O(n)
// S.C  ---> O(1)

class Main {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        
        if(n>0){
            System.out.println(a);
        }
        if(n>1){
            System.out.println(b);
        }
        
        while(n>2){
            int c= a+b;
            System.out.println(c);
            a = b;
            b = c;
            n--;
        }
       
    }
}
