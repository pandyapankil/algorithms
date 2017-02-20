public class Solution {
    int area(int[] arr){
        int size = arr.length, i = 0, topArea, maxArea = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        
        while(i < size){
            while((i < size) && (stack.isEmpty() || arr[stack.peek()] <= arr[i]))
                stack.push(i++);
            while((!stack.isEmpty()) && (i == size || arr[stack.peek()] > arr[i])){
                topArea = arr[stack.pop()] * (stack.isEmpty() ? i : i-stack.peek()-1);
                maxArea = Math.max(maxArea, topArea);
            }
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if(m == 0)
            return 0;
        int n = matrix[0].length;            
        int currArea, maxArea = 0, i, j;
        
        int[] arr = new int[n];
        
        for(j=0; j<n; j++)
            arr[j] = Character.getNumericValue(matrix[0][j]);
        currArea = area(arr);
        maxArea = Math.max(maxArea, currArea);
        
        for(i=1; i<m; i++){
            for(j=0; j<n; j++){
                int val = Character.getNumericValue(matrix[i][j]);
                arr[j] =  (val == 1) ? arr[j] + val : 0;
            }
            currArea = area(arr);
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}