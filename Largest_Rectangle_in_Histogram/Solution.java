public class Solution {
    public int largestRectangleArea(int[] heights) {
        int size = heights.length, i = 0, topArea = -1, maxArea = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        
        while(i < size){
            while((i<size) && (stack.isEmpty() || heights[stack.peek()] <= heights[i]))
                stack.push(i++);
            while((!stack.isEmpty()) && (i == size || heights[stack.peek()] > heights[i])){
                topArea = heights[stack.pop()] * (stack.isEmpty() ? i : i-stack.peek()-1);
                maxArea = Math.max(topArea, maxArea);
            }
        }
        return maxArea;
    }
}