import java.util.Iterator;
import java.util.TreeSet;

/*
 * �� �� �̾Ƽ� ���ϱ�
���� ����
���� �迭 numbers�� �־����ϴ�.
 numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ����
  �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
numbers�� ���̴� 2 �̻� 100 �����Դϴ�.
numbers�� ��� ���� 0 �̻� 100 �����Դϴ�.
����� ��
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
        Iterator<Integer> iter = set.iterator(); // set�� Iterator �ȿ� ���
        while(iter.hasNext()) { //iter�� ���� ���� �����Ͱ� �ִٸ�
			
			answer[cnt++] = iter.next();// iter���� �� ������ answer�迭�� ���
			if(cnt == set.size()) break;
		}
		
        
        return answer;
    }
	public static void main(String[] args) {// �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_31 algo = new algo1_31();
		int[] result = algo.solution(new int[]{2,1,3,4,1});
		if(result[0] == 2 && result[1] == 3 && result[2] == 4 && result[3] == 5 &&
				result[4] == 6 && result[5] == 7) System.out.println("�¾ҽ��ϴ�.");

	}

}
