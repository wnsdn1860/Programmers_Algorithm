/*
 * ���� ����  ( ����� �� )
���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
n�� 0 �̻� 3000������ �����Դϴ�.
 * */
public class algo1_16 {
	public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) sum += i;
        }
        return sum;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ�
		algo1_16 algo = new algo1_16();
		int result = algo.solution(12);
		if(result == 28) System.out.println("�¾ҽ��ϴ�.");
	}

}
