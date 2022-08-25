public class oddoreven {
    public static void soloddoreven(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("no. is odd");
        }
        else{
            System.out.println("no. is even");
        }
    }

    public static void main(String[] args) {
        soloddoreven(3);
        soloddoreven(16);
        }
    
}
