/*
 * ���� ���� ( ���ڿ��� ������ �ٲٱ� )
���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
s�� ���̴� 1 �̻� 5�����Դϴ�.
s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
s�� "0"���� �������� �ʽ��ϴ�.
 * */
public class algo1_18 {
	public int solution(String s) {
        int answer = Integer.parseInt(s);
        
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_18 algo = new algo1_18();
		int result = algo.solution("1234");
		if(result == 1234) System.out.println("�¾ҽ��ϴ�.");
	}

}
