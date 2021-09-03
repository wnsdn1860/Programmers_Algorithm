import java.util.ArrayList;
import java.util.Collections;


public class algo1_32 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<d.length; i++) {
        	list.add(d[i]);
        }
        Collections.sort(list);        
        long budg = budget;
        for(int a : list) {
        	sum += a;        	
        	if(sum > budg) {
        		break;
        	}
        	cnt++;
        }
        answer = cnt;
        return answer;
        
    }
	public static void main(String[] args) {// 테스트케이스 확인용 main 코드 
		algo1_32 algo = new algo1_32();
		int result = algo.solution(new int[]{1,3,2,5,4}, 9);
		if(result == 3) {
			System.out.println("맞았습니다.");
		}

	}

}
