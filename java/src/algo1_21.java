/*
 * ���� ���� ( ���￡�� �輭�� ã�� )
String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
 seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
"Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
 * */
public class algo1_21 {
	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) answer += "�輭���� "+i+"�� �ִ�";           
        }
        return answer;
    }
	public static void main(String[] args) {// �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_21 algo = new algo1_21();
		String result = algo.solution(new String[]{"Jane","Kim"});
		if(result.equals("�輭���� 1�� �ִ�")) System.out.println("�¾ҽ��ϴ�.");
	}

}
