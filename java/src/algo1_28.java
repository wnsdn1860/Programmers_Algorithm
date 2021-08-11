import java.util.ArrayList;

/*
 * ���� ���� ( ���� ���ڴ� �Ⱦ� )
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
�̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�.
 ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
 * */
public class algo1_28 {
	public int[] solution(int []arr) {  		
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]); // ù��°���� ����
       for(int i=1; i<arr.length; i++) {
    	   if(arr[i] != arr[i-1]) list.add(arr[i]); // �յڷ� ���Ͽ� ���̾����� �ڿ��κ� list�� �߰� +1���ϸ� index�ʰ�
       }
       int[] answer = new int[list.size()];
       for(int i=0; i<list.size(); i++) {
    	   answer[i] = list.get(i);
       }       
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_28 algo = new algo1_28();
		int[] result = algo.solution(new int[]{1,1,3,3,0,1,1});
		if(result[0] == 1 && result[1] == 3 && result[2] == 0 && result[3] == 1) System.out.println("�¾ҽ��ϴ�.");

	}

}
