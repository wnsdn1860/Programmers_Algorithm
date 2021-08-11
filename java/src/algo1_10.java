import java.util.*;

/*
 * 문제 설명  ( 제일 작은수 제거하기 )
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 * */
public class algo1_10 {

	public int[] solution(int[] arr) {
        
	       if(arr.length == 1) return new int[] {-1};
	        
	        List<Integer> list = new ArrayList<>();
	        for(int i=0; i<arr.length; i++) {
	            list.add(arr[i]);
	        }
	        int min = arr[0];
	        
	        for(int i=0; i<arr.length; i++) {
	            if(min > arr[i]) {               
	                min = arr[i];                
	            }
	        }
	        while(list.contains(min)) {
	            int index = list.indexOf(min);
	            list.remove(index);
	        }
	        int[] sol = new int[list.size()];
	        for(int i=0; i<list.size(); i++) {
	            sol[i] = list.get(i);
	        }
	        return sol;
	    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드
		algo1_10 algo = new algo1_10();
		int[] result = algo.solution(new int[]{4,3,2,1});
		
		if(result[0] == 4 && result[1] == 3 && result[2] == 2) System.out.println("맞았습니다.");

	}

}
