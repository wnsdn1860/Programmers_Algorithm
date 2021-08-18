import java.util.Iterator;
import java.util.TreeSet;

/*
 * 두 개 뽑아서 더하기
문제 설명
정수 배열 numbers가 주어집니다.
 numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
  배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.
입출력 예
numbers	result
[2,1,3,4,1]	[2,3,4,5,6,7]
[5,0,2,7]	[2,5,7,9,12]
 * */
public class algo1_31 {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> set = new TreeSet<Integer>();
        int cnt = 0;
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		if(i==j) continue;
        		set.add(numbers[i]+numbers[j]);
        	}        	
        }
        answer = new int[set.size()];
        System.out.println(set.size());
        Iterator<Integer> iter = set.iterator(); // set을 Iterator 안에 담기
        while(iter.hasNext()) { //iter에 다음 읽을 데이터가 있다면
			
			answer[cnt++] = iter.next();// iter에서 값 꺼내서 answer배열에 담기
			if(cnt == set.size()) break;
		}
		
        
        return answer;
    }
	public static void main(String[] args) {// 테스트케이스 확인용 main 코드 
		algo1_31 algo = new algo1_31();
		int[] result = algo.solution(new int[]{2,1,3,4,1});
		if(result[0] == 2 && result[1] == 3 && result[2] == 4 && result[3] == 5 &&
				result[4] == 6 && result[5] == 7) System.out.println("맞았습니다.");

	}

}
