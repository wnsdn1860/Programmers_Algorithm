/*
 *  ( x만큼 간격이 있는 n개의 숫자 )
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * 제한 조건
	x는 -10000000 이상, 10000000 이하인 정수입니다.
	n은 1000 이하인 자연수입니다.
 * */
public class algo1_2 {
	public long[] solution(long x, int n) { 
		long[] answer = {};
    answer = new long[n];
    long k = x;
    for(int i=0; i<n; i++) {            
        answer[i] = x;
        x = k * ( i+2);
    }
    return answer;
	}

	public static void main(String[] args) { // 테스트케이스 확인용 main 코드
		 	algo1_2 algo = new algo1_2();
		 	long result[] = algo.solution(2, 5);
		 	
		 	if(result[0] == 2 && result[1] == 4 &&
		 	result[2] == 6 && result[3] == 8 && result[4] == 10 ) {
		 		System.out.println("맞았습니다.");
		 	}
		 	
	}

}
