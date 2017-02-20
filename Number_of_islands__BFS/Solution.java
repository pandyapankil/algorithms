public class Solution {
    
    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    static boolean isValid(int row, int col, int ROW, int COL){
        return ((row >= 0) && (col >= 0) && (row < ROW) && (col < COL));
    }
    
    public int numIslands(char[][] grid) {
        int M = grid.length;
        if(M == 0)
            return 0;
        int N = grid[0].length;
        LinkedList<Point> q = new LinkedList<Point>();
        boolean[][] visited = new boolean[M][N];
        
        int[] rowNum = {-1,0,0,1};
        int[] colNum = {0,-1,1,0};
        int count = 0;
        
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    q.add(new Point(i,j));
                    //System.out.println(i+"    "+j);
                    while(!q.isEmpty()){
                        Point curPoint = q.remove();
                        for(int k=0; k<4; k++){
                            int row = curPoint.x + rowNum[k];
                            int col = curPoint.y + colNum[k];
                            
                            if(isValid(row,col,M,N) && grid[row][col] == '1' && !visited[row][col]){
                                visited[row][col] = true;
                                q.add(new Point(row,col));
                            }
                        }
                    }
                }
            }
        }
        
        return count;
    }
}