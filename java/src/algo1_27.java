import java.util.Arrays;

/*
 * 문제 설명 ( 나누어 떨어지는 숫자 배열 )
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
 * */
public class algo1_27 {
public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0; // 배열 초기화를 위한 카운트
        int cnt2 = 0; // answer에 값을 저장하기 위한 카운트
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) cnt++;
        }
        if(cnt == 0) return new int[]{-1}; // 나누어떨어지는게 없으면 배열에 -1 담아 리턴
        int[] answer = new int[cnt]; 
        for(int i=0; i<arr.length; i++) {
         if(arr[i] % divisor == 0) answer[cnt2++] = arr[i];
        }
        Arrays.sort(answer);
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_27 algo = new algo1_27();
		int[] result = algo.solution(new int[]{5,9,7,10}, 5);
		if(result[0] == 5 && result[1] == 10) System.out.println("맞았습니다.");

	}

}
