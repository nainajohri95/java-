public class RecursionFact {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fact1 = fact(n-1); // factorial od n-1
        int fact2 = n * fact(n-1);
        return fact2 ;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n)); 
    }
}
