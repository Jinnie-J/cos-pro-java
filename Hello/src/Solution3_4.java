// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution3_4 {
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
				int answerA=0;
				int answerB=0;
				for(int i=Math.min(s1.length(), s2.length()); i>0 ; i--){
					if(s1.substring(s1.length()-i).equals(s2.substring(0,i))){
						answerA = i;
						break;
					}
				}
			
				for(int i=Math.min(s1.length(), s2.length()); i>0 ; i--){
					if(s2.substring(s2.length()-i).equals(s1.substring(0,i))){
						answerB = i;
						break;
					}
				}
			
        int answer = s1.length() + s2.length() - Math.max(answerA,answerB);
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution3_4 sol = new Solution3_4();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}