import java.util.*;

public class Directories{
	public static int solution(String S) {
		// write your code in Java
		String[] tokens = S.split("\n");
		int n  = tokens.length, i, prevSpace = 0, ans = 0;	
		int[] length = new int[n];
		//length[0] = tokens[0].trim().length() + 1;
		//StringBuffer strBuf = new StringBuffer("/");
		//strBuf.append(tokens[0].trim());
		
		//System.out.println(strBuf);
		for(i=0; i<n; i++){
			int curLength = tokens[i].trim().length();
			int curSpace = tokens[i].length() - curLength;
			//if(prevSpace + 1 != curSpace){
				//int diff = prevSpace - curSpace + 1;									
				/*while(diff-- > 0){
					int pos = strBuf.lastIndexOf("/");
					strBuf.delete(pos, strBuf.length());
				}*/

			/*if(curSpace == 0)
				length[curSpace] = tokens[i].trim().length() + 1;
			else	
				length[curSpace] = length[curSpace - 1] + tokens[i].trim().length() + 1;*/
			length[curSpace] = ((curSpace == 0) ? 0 : length[curSpace - 1]) + curLength + 1;
			//}
			//else
			//	length[curSpace] = length[curSpace - 1] + tokens[i].trim().length()+1; 
			//prevSpace = curSpace;
			//strBuf.append("/"+tokens[i].trim());
			//System.out.println(strBuf);

			if(tokens[i].endsWith(".jpeg") || tokens[i].endsWith(".gif") || tokens[i].endsWith(".png"))
					
				ans += length[curSpace];//strBuf.length();				
		}
		return ans;
	}	
	/*
	static int solution(String S) {
        // write your code in Java SE 8
        String[] tokens = S.split("\n");
        int n = tokens.length, i, ans = 0;
        int[] length = new int[n];
        
        for(i=0; i<n; i++){
                int curLength = tokens[i].trim().length();
                int curSpace = tokens[i].length() - curLength;                
                if(tokens[i].endsWith(".jpeg") || tokens[i].endsWith(".png") || tokens[i].endsWith(".gif"))
                    ans = Math.max(ans, (curSpace > 0) ? length[curSpace-1] : 1);
                else
                    length[curSpace] = ((curSpace == 0) ? 0 : length[curSpace - 1]) + curLength + 1;
        }
        
        return ans;
    }
	*/
		

    	public static void main (String[] args){
	       String S="dir1\n" +
               	 " dir11\n" +
	                " dir12\n" +
	                "  picture.jpeg\n" +
	                "  dir121\n" +
	                "  file1.txt\n" +
	                "dir2\n" +
	                " file2.gif\n"+
		 " file3.jpeg";
	        System.out.println(solution(S));
	        //test
	    }
}