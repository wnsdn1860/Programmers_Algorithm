/*
 * ���� ���� ( �� ���� ������ �� )
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
 * */
public class algo1_26 {
	public long solution(int a, int b) {
        long result = 0;
        long num1 = (long) a;
        long num2 = (long) b;
        if(num1 == num2) return num1; // �Ȱ����� ���� �ƹ��ų� ����
        if(num1 > num2) {
            result = ((num1 * (num1+1)) / 2) -  ((num2 * (num2-1)) / 2);
        }
        else {
            result = ((num2 * (num2+1)) / 2) -  ((num1 * (num1-1)) / 2);
        }
        return result;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_26 algo = new algo1_26();
		long result = algo.solution(3, 5);
		if(result == 12) System.out.println("�¾ҽ��ϴ�.");
	}

}
