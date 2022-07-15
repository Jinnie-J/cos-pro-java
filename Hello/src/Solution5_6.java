class Solution5_6 {
	int [] numbers_int = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	char [] numbers_char = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	int char_to_int(char ch) {
	    for (int i = 0; i < 10; i++)
	        if (ch == numbers_char[i])
	            return numbers_int[i];
		return 0;
	}
	
	char int_to_char(int val) {
		for (int i = 0; i < 10; i++)
			if (val == numbers_int[i])
				return numbers_char[i];
		return 0;
	}
	
	String convert_scale(int num, int q) {
		if (num == 0) return "";
		return convert_scale(num / q, q) + int_to_char(num % q);
	}

	public int parse_decimal(String s, int p) {
		int num = 0;
		for (int i = s.length() - 1, mul = 1; i >= 0; i--, mul *= p) {
			num += char_to_int(s.charAt(i)) * mul;
		}
		return num;
	}
	
    public String solution(String s1, String s2, int p, int q) {
    	int num1 = parse_decimal(s1, p);
    	int num2 = parse_decimal(s2, p);
    	String answer = convert_scale(num1 + num2, q);
    	return answer;
    }

    
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.	
    public static void main(String[] args) {
    	Solution5_6 sol = new Solution5_6();
    	String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
    	String ret = sol.solution(s1, s2, p, q);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
   }
}
