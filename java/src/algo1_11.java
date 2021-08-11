/*
 * 문제 설명  ( 정수 제곱근 판별 )
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.
 * */
public class algo1_11 {
	public long solution(long n) {
        long answer = 0;
        long m = 0;
       long num = (long) Math.sqrt(n);
        
        if(Math.pow(num,2) == n ){
            m = (long)Math.pow(num +1,2);
            return m;
        }
        else return -1;
        
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드
		algo1_11 algo = new algo1_11();
		long result = algo.solution(121);
		if(result == 144) System.out.println("맞았습니다.");
	}

}
