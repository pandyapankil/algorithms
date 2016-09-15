// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class BinaryGap{
    String toBinary(int number){
        String s = "";
        while(number > 0){
            s = number%2 + s;
            number /= 2;
        }
        return s;
    }    
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = toBinary(N);         
        Pattern p = Pattern.compile("0+1");
        Matcher m = p.matcher(binary);         
        int binaryGap = 0;
        while(m.find()){                        
            binaryGap = Math.max(m.group().length()-1, binaryGap);            
        }
        return binaryGap;
    }
}