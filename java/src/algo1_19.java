/*
 * ���� ���� ( ���ڼ��ڼ��ڼ�?? )
���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.

���� ����
n�� ���� 10,000������ �ڿ����Դϴ�.
 * */
public class algo1_19 {
	public String solution(int n) {
        String answer = "";
        
        for(int i=1; i<=n; i++) {
        if(i % 2 == 0) answer += "��";
        else answer += "��";
        }
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_19 algo = new algo1_19();
		String result = algo.solution(3);
		if(result.equals("���ڼ�")) System.out.println("�¾ҽ��ϴ�.");
	}

}
