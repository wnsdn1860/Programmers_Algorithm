/*
 * ( �ϻ��� �� ) = �־��� �������� �� ���� �� �ڸ��� ������ ������ ����������� �ڿ���
 * ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�.
 *  ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
 *  �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� 1 �̻�, 10000 ������ �����Դϴ�.
 * */
public class algo1_5 {
	public boolean solution(int x) {
        int a = x ;     
        int sum = 0;
        
        while (a >= 1) {
            sum += a % 10;
			a /= 10;
        }
        if ( x % sum == 0) return true;
        
        else return false;
        }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_5 algo = new algo1_5();
		boolean result = algo.solution(10);		
		if(result) System.out.println("true");
	}

}
