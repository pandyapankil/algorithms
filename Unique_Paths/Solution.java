public class Solution {
    public int uniquePaths(int m, int n) {
        long ans = 1, temp = 1;
        if(m<n){
            int t = m;
            m = n;
            n = t;
        }
        for(int i = m+n-2; i>=m; i--){
            ans *= (long)i;
            temp *= (long)(i-m+1);
        }
        return (int)(ans/temp);
    }
}