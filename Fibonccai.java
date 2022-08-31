public class Fibonccai {
    public static int fib(int n){
        if(n == 0 || n == 1){         //base case
            return n;
        }

        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fib3 = fib1 + fib2 ;
        return fib3;
    }
    public static void main(String[] args) {
        int n= 5;
        System.out.println(fib(n));
    }
        
}

