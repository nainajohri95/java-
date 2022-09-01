public class Recursionsol2 {
    public static int tilingproblem(int n){ //2*n(floor size)
    
        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //vertical choice
        int vt = tilingproblem(n-1);

        //horizontal choice
        int ht = tilingproblem(n-2);

        int totalways =  vt + ht;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(9));
    }
}

