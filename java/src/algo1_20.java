/*
 * 문제 설명 ( 소수 찾기 )
1부터 입력받은 숫자  n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
 * */
public class algo1_20 {
	public int solution(int n) {
        int arr[] = new int[n+1];
        int answer = 0;
        
        for(int i=0; i<=n; i++) {
            arr[i] = i;            
        }        
        arr[1] = 0;        
        
        for(int i=2;i<=n;i++){
            if(arr[i]==0)continue;
            for(int j=i+i;j<=n;j+=i){
                arr[j]=0;
            }
        }


        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                answer++;
            }
        }
        return answer;
    }
	public static void main(String[] args) {// 테스트케이스 확인용 main 코드 
		algo1_20 algo = new algo1_20();
		int result = algo.solution(10);
		if(result == 4 ) System.out.println("맞았습니다.");
	}

}
