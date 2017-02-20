import java.util.*;

public class CC{

	static void DFS(ArrayList<Integer>[] adj, int v, boolean[] marked){
		marked[v] = true;
		for(int w : adj[v])
			if(!marked[w])
				DFS(adj, w, marked);
	}

	static int connectedComponents(String[] arr){
		
		int V = arr.length;
		int[][] graph = new int[V][V];
		
		int row,col;
		for(row = 0; row < V; row++){
			for(col = 0; col < V; col++){
				graph[row][col] = Integer.parseInt(arr[row].charAt(col) + "");
			}
		}
		
		LinkedList<Integer>[] adj = (LinkedList<Integer>[]) new LinkedList[V];
		
		for(row = 0; row < V; row++)		  
			adj[row] = new LinkedList<Integer>();		


		for(row = 0; row < V; row++){
			for(col = 0; col < V; col++){
				if(graph[row][col] == 1){
					adj[row].add(col);
					adj[col].add(row);
				}
			}
		}		


		int count = 0;	
		boolean[] marked = new boolean[V];
		for(int s = 0; s < V; s++){
			if(!marked[s]){
				DFS(adj, s, marked);
				count++;
			}		
		}		
		return count;	
	}


	public static void main(String[] args){
		
		/*String[] strings = new String[]{
			"1100",
			"1110",
			"0110",
			"0001"
		};*/

		String[] strings= new String[]{
			"001000",
			"001000",
			"110000",
	        "000000",
            "000001",
            "000010",
		};

		int count = connectedComponents(strings);
		System.out.println(count);
	}
}
		