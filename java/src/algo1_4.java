/*
 * ���� ����  ( �ڵ��� ��ȣ ������ )
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
 * */
public class algo1_4 {
	public String solution(String phone_number) {
        String answer = "";
        
        
        String a1 = phone_number.substring(0,phone_number.length() - 4);
        String a2 = phone_number.substring(phone_number.length() - 4 , phone_number.length());
        String star = "";
        for(int i=0; i < a1.length(); i++) {
            star += "*";
        }
        answer = star + a2;
        return answer;
      
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ�
		algo1_4 algo = new algo1_4();
		String result = algo.solution("01033334444");
		if(result.equals("*******4444")) System.out.println("�¾ҽ��ϴ�.");
	}

}
