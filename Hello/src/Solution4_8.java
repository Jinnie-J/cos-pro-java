// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution4_8 {
	
	  public void per(int[] arr, int[] output, boolean[] visited, int depth, int r, ArrayList<Integer> list){
			if(depth == r) {
				String s = "";
				for(int i=0;i<r;i++) {
					s+= Integer.toString(output[i]);
				}
				list.add(Integer.parseInt(s));
			}

			for(int i = 0; i < arr.length; i++) {
				if(!visited[i]) {
					visited[i] = true;
					output[depth] = arr[i];
					per(arr, output, visited, depth + 1, r,list);    
					visited[i] = false;
				}
			}
	
		}
	  

    public int solution(int[] card, int n) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int r=card.length;
		int[] output = new int[r];
		boolean[] visited = new boolean[r];
		Arrays.sort(card);
		per(card, output, visited, 0, r, list);
		
		for(int i=0;i<list.size();i++) {
			if( n== list.get(i)) {
				answer = i+1;
				break;
			}
		}	
		if(answer==0) answer=-1;
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution4_8 sol = new Solution4_8();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }    
}
    
