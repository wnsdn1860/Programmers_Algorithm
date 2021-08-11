import java.util.Arrays;

/*
 * ���� ���� ( ������ �������� ���� �迭 )
array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

���ѻ���
arr�� �ڿ����� ���� �迭�Դϴ�.
���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
divisor�� �ڿ����Դϴ�.
array�� ���� 1 �̻��� �迭�Դϴ�.
 * */
public class algo1_27 {
public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0; // �迭 �ʱ�ȭ�� ���� ī��Ʈ
        int cnt2 = 0; // answer�� ���� �����ϱ� ���� ī��Ʈ
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) cnt++;
        }
        if(cnt == 0) return new int[]{-1}; // ����������°� ������ �迭�� -1 ��� ����
        int[] answer = new int[cnt]; 
        for(int i=0; i<arr.length; i++) {
         if(arr[i] % divisor == 0) answer[cnt2++] = arr[i];
        }
        Arrays.sort(answer);
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_27 algo = new algo1_27();
		int[] result = algo.solution(new int[]{5,9,7,10}, 5);
		if(result[0] == 5 && result[1] == 10) System.out.println("�¾ҽ��ϴ�.");

	}

}
