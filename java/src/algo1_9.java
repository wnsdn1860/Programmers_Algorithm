/*
 * ���� ���� ( ¦���� Ȧ�� )
���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.
 * */
public class algo1_9 {
	public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0 ) return "Even";
        else return "Odd";
        
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_9 algo = new algo1_9();
		String result = algo.solution(3);
		if(result.equals("Odd")) System.out.println("�¾ҽ��ϴ�.");
	

	}

}
