/*
 * 문제 설명  ( 정수 내림차순으로 정렬하기 )
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
 * */
public class algo1_12 {
	public long solution(long n) {
	      
		String str = String.valueOf(n);
		String result = "";
		long arr[] = new long[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';			
		}
		
		for(int j=0; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				if(arr[j] < arr[k]) {
					long temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			result += arr[i];
		}
		
		long reverse = Long.parseLong(result);
		return reverse;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드
		algo1_12 algo = new algo1_12();
		long result = algo.solution(118372);
		if(result == 873211) System.out.println("맞았습니다.");
	}

}
