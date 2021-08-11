/*
 * 문제 설명  ( 최대공약수와 최소공배수 )
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.
 * */
public class algo1_8 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp = 0;
        int temp2 = 0;
        int abc = n*m;
        if(m > n) { 
            temp = n;
            n = m;
            m = temp;        
        }       // 무조건 큰수는 n
        // 최대공약수
        if(n % m == 0) {
            answer[0] = m;
        }
        while(true) {
            if(n % m != 0) {
                temp2 = n % m;
                n = m;
                m = temp2;
            }
            else {
                answer[0] = m;
                break;
            }
        }
        // 최소공배수
        answer[1] = abc / answer[0];
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드
		algo1_8 algo = new algo1_8();
		int[] result = algo.solution(3, 12);
		
		if(result[0] == 3 && result[1] == 12) System.out.println("맞았습니다.");
	

	}

}
