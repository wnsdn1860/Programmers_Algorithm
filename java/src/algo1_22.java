/*
 * ���� ���� ( ���ڿ� �ٷ�� �⺻ )
���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
���� ��� s�� "a234"�̸� False�� �����ϰ� "1234"��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
 * */
public class algo1_22 {
	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6)  return false;
        
        try {
			if(s.length() == 4 || s.length() == 6) {
                Integer.parseInt(s);
                return true;
		    }
        }
		catch(NumberFormatException e) {
			return false;
		}
            
        return answer;
    }
	public static void main(String[] args) {// �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_22 algo = new algo1_22();
		boolean result = algo.solution("a234");
		if(!result) System.out.println("�¾ҽ��ϴ�.");
	}

}
