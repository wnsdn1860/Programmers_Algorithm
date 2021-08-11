/*
 * 문제 설명 ( 자릿수 더하기 )
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
 * */
public class algo1_14 {

	 public int solution(int n) {
	        String str = String.valueOf(n);
	        
	        int result = 0;
	        for(int i=0; i<str.length(); i++) {            
	            result += str.charAt(i) - '0';
	        }
	        return result;
	    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_14 algo = new algo1_14();
		int result = algo.solution(123);
		if(result == 6) System.out.println("맞았습니다.");
	}

}
