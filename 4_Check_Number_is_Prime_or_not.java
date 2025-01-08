// Check Number is Prime no.
// T.C  ---> O(sqrt(n))
// S.C  ---> O(1)

class Main {
    public static void main(String[] args) {
        int n = 5;
        boolean isPrime = true;
        if(n<2){
            System.out.println("Not Prime");
            return;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        
        if(isPrime){
            System.out.println("Yes Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
