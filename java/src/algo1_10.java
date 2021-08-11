import java.util.*;

/*
 * ���� ����  ( ���� ������ �����ϱ� )
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
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
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ�
		algo1_10 algo = new algo1_10();
		int[] result = algo.solution(new int[]{4,3,2,1});
		
		if(result[0] == 4 && result[1] == 3 && result[2] == 2) System.out.println("�¾ҽ��ϴ�.");

	}

}
