/*
 * ���� ����  ( ���� ������ �Ǻ� )
������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

���� ����
n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
 * */
public class algo1_11 {
	public long solution(long n) {
        long answer = 0;
        long m = 0;
       long num = (long) Math.sqrt(n);
        
        if(Math.pow(num,2) == n ){
            m = (long)Math.pow(num +1,2);
            return m;
        }
        else return -1;
        
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ�
		algo1_11 algo = new algo1_11();
		long result = algo.solution(121);
		if(result == 144) System.out.println("�¾ҽ��ϴ�.");
	}

}
