/*
 * ��� ���� ��������
���� ����
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
 * */
public class algo1_29 {
	public String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();
        int num = 0;
        if(s.length() == 1 || s.length() == 2) return s;
        
        if(s.length() % 2 == 0) {
            num = s.length() / 2;
            answer = Character.toString(str[num-1]) + Character.toString(str[num]) ;
        }
        else {
        	num = s.length() / 2;
            answer = Character.toString(str[num]);
        }
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_29 algo = new algo1_29();
		String result = algo.solution("abcde");
		if(result.equals("c")) System.out.println("�¾ҽ��ϴ�.");
	}

}
