// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution3_5 {
    public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
			
				String answer = "";
				int slen = phrases.length();
			
				if(second >= slen*2){
					second = second% (slen*2);
				}
			
				if(second <= slen){ //1초면 13, 2초면 12, 13초면 1, 14초면 0
					for(int i= slen; i>second; i--){
						answer+='_';
					}
					answer+=phrases.substring(0,0+second);
				}
			
				else{ //15초면 1 appy-birthday_, 27초면 13 y________
				answer+=phrases.substring(second-slen*2);
				for(int i= slen; i< second; i++){
					answer+='_';
				}
			}
				
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution3_5 sol = new Solution3_5();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}