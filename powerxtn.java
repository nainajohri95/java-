public class powerxtn {
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        int x1 = power(x,n-1);
        int x2 = x * x1;
        return x2;
    }

    public static void main(String[] args) {
    
        System.out.println(power(9,2));
    }
}
