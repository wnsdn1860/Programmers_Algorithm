/*
 * ���� ���� ( �ڸ��� ���ϱ� )
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���
 * */
public class algo1_14 {

	 public int solution(int n) {
	        String str = String.valueOf(n);
	        
	        int result = 0;
	        for(int i=0; i<str.length(); i++) {            
	            result += str.charAt(i) - '0';
	        }
	        return result;
	    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_14 algo = new algo1_14();
		int result = algo.solution(123);
		if(result == 6) System.out.println("�¾ҽ��ϴ�.");
	}

}
