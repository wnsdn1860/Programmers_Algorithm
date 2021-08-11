/*
 * 문제 설명  ( 약수의 합 )
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 정수입니다.
 * */
public class algo1_16 {
	public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) sum += i;
        }
        return sum;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드
		algo1_16 algo = new algo1_16();
		int result = algo.solution(12);
		if(result == 28) System.out.println("맞았습니다.");
	}

}
