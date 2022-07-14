class Solution1_2{
    int[][] pane;
    int dx[] = {0, 1, 0, -1};
    int dy[] = {1, 0, -1, 0};
    boolean inRange(int i, int j, int n){
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    public int solution(int n){
        pane = new int[n][n];
        int ci = 0;
        int cj = 0;
        int num = 1;
        while(inRange(ci, cj, n) && pane[ci][cj] == 0){
            for(int k = 0; k < 4; k++){
                if(!inRange(ci, cj, n) || pane[ci][cj] != 0) break;
                while(true){
                    pane[ci][cj] = num++;
                    int ni = ci + dy[k];
                    int nj = cj + dx[k];
                    if(!inRange(ni, nj, n) || pane[ni][nj] != 0){
                        ci += dy[(k + 1) % 4];
                        cj += dx[(k + 1) % 4];
                        break;
                    }
                    ci = ni;
                    cj = nj;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) ans += pane[i][i];
        return ans;
    }


public static void main(String[] args) {
	Solution1_2 sol = new Solution1_2();
    int n1 = 3;
    int ret1 = sol.solution(n1);
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    int n2 = 2;
    int ret2 = sol.solution(n2);
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
