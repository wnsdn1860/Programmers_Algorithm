/*
 * ���� ����  ( �ִ������� �ּҰ���� )
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������.
 �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
 ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

���� ����
�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
 * */
public class algo1_8 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp = 0;
        int temp2 = 0;
        int abc = n*m;
        if(m > n) { 
            temp = n;
            n = m;
            m = temp;        
        }       // ������ ū���� n
        // �ִ�����
        if(n % m == 0) {
            answer[0] = m;
        }
        while(true) {
            if(n % m != 0) {
                temp2 = n % m;
                n = m;
                m = temp2;
            }
            else {
                answer[0] = m;
                break;
            }
        }
        // �ּҰ����
        answer[1] = abc / answer[0];
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ�
		algo1_8 algo = new algo1_8();
		int[] result = algo.solution(3, 12);
		
		if(result[0] == 3 && result[1] == 12) System.out.println("�¾ҽ��ϴ�.");
	

	}

}
