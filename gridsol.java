public class gridsol {
    public static int countGirdways(int i, int j, int n, int m){
        //base case
        if( i == n && j == m){  //last cell (when we are at last cell ,no. of ways to reach last cell is 1)
            return 1;
        }
        else if(i > n  || j > m){
            return 0;
        }
        int ways = countGirdways(i+1, j, n, m) + countGirdways(i, j+1, n, m);
        return ways;
    }
    public static void main(String[] args) {
        int n = 3, m = 3; 
        System.out.println(countGirdways(0,0,n-1,m-1)); 
     }
}
//Rigth turns = no. of columns = m
//Down turns = no. of rows = n
//Time complexiy:- 0(2^n+m)