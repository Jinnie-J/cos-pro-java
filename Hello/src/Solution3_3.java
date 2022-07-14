// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution3_3 {
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        
        HashSet<int[]> set = new HashSet<int[]>();
        //List<Integer> list = new ArrayList<>();
        int[] dx= {1,-1,-1,1};
        int[] dy= {1,-1,1,-1};
        
        for (int i=0; i<bishops.length;i++) {
        	String bis = bishops[i];      	
        	
        	for(int j=0; j<4;j++) {
            	int x = bis.charAt(0) - 'A';
            	int y = bis.charAt(1) - '0' - 1;  
            	int nx=x;
            	int ny=y;
        		while(true) {
		        	nx +=dx[j];
		        	ny +=dy[j];		        	
		        	if(nx<0 || nx>=8 || ny<0 || ny>=9) break;
		        	int[] arr = {nx,ny};	   
		        	set.add(arr);
        		}
        	}
        }
        System.out.println(set.size());
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution3_3 sol = new Solution3_3();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}