// You may use import as below.
import java.util.*;

class Solution1_3 {
    public int solution(String pos) {
        // Write code here.
        int answer = 0;
        
        String first = pos.substring(0,1);
        String second = pos.substring(1,2);
        
        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        
        int x = map.get(first)-1;
        int y = Integer.parseInt(second)-1;
        
        int dx[] = {-2,-2,-1,-1,1,1,2,2};
        int dy[] = {-1,1,-2,2,-2,2,-1,1};
        
        for(int i=0;i<8;i++) {
        	int nx = x+dx[i];
        	int ny = y+dy[i];
        	if(0<=nx && nx<8 && 0<=ny && ny<8) {
        		answer+=1;
        	}
        }
         
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution1_3 sol = new Solution1_3();
        String pos = "D4";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}