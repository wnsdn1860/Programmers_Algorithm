/*
 * 문제 설명 ( 자연수 뒤집어 배열로 만들기 )
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
 * */
public class algo1_13 {
	public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int cnt = 0;
        for(int i=str.length(); i>0; i--) {       
           int num = str.charAt(i-1) - '0';
            answer[cnt++] = num;
        }
            
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_13 algo = new algo1_13();
		int[] result = algo.solution(12345);
		if(result[0] == 5 && result[1] == 4 && result[2] == 3 && result[3] == 2 && result[4] == 1) System.out.println("맞았습니다.");
	}

}
