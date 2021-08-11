/*
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요. ( 평균 구하기 )
 
제한사항 
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 * */
public class algo1_6 {

	public double solution(int[] arr) {
        double answer = 0;
        
        int sum = 0;
        for(int i=0; i< arr.length; i++) {
            sum += arr[i];
        }
        answer = (double) sum / arr.length;
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_6 algo = new algo1_6();
		double result = algo.solution(new int[]{1,2,3,4});
		if(result == 2.5) System.out.println("맞았습니다.");
	}

}
