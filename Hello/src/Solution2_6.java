// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution2_6 {
    public int[] solution(String commands) {
        // 여기에 코드를 작성해주세요.
    	
    	//L: x축 방향으로 -1 / R: x축 방향으로 +1 / U: y축 방향으로 +1 / D: y축 방향으로 -1
    	
    	int x = 0;
    	int y = 0;
    	
    	for(int i=0; i<commands.length();i++) {
    		Character tmp = commands.charAt(i);
    		if(tmp=='U') y+=1;
    		if(tmp=='L') x-=1;
    		if(tmp=='R') x+=1;
    		if(tmp=='D') y-=1;
    		
    	}
        int[] answer = {x,y};
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution2_6 sol = new Solution2_6();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}