public class Solution {
    public void rotate(int[][] matrix) {
        
        
        for(int T = 0, B = matrix.length-1, L = 0, R = matrix.length-1; T < B && L < R; L++, R--, T++, B--){
            for(int t = T, b = B, l = L, r = R; l < R; l++, r--, t++, b--){
                int temp = matrix[T][l];
                matrix[T][l] = matrix[b][L];
                matrix[b][L] = matrix[B][r];
                matrix[B][r] = matrix[t][R];
                matrix[t][R] = temp;
            }
        }
    }
}