import java.util.ArrayList;

/*
 * 문제 설명 ( 같은 숫자는 싫어 )
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 * */
public class algo1_28 {
	public int[] solution(int []arr) {  		
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]); // 첫번째수는 고정
       for(int i=1; i<arr.length; i++) {
    	   if(arr[i] != arr[i-1]) list.add(arr[i]); // 앞뒤로 비교하여 같이않으면 뒤에부분 list에 추가 +1로하면 index초과
       }
       int[] answer = new int[list.size()];
       for(int i=0; i<list.size(); i++) {
    	   answer[i] = list.get(i);
       }       
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_28 algo = new algo1_28();
		int[] result = algo.solution(new int[]{1,1,3,3,0,1,1});
		if(result[0] == 1 && result[1] == 3 && result[2] == 0 && result[3] == 1) System.out.println("맞았습니다.");

	}

}
