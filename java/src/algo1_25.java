import java.util.Arrays;

/*
 * ���� ���� ( ���ڿ� �� ������� �����ϱ� )
���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� strings�� �����մϴ�.

���� ����
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
 * */
public class algo1_25 {
	 public String[] solution(String[] strings, int n) {
         String[] answer = new String[strings.length];
         for(int i=0; i<answer.length; i++) {
             answer[i] = (strings[i].charAt(n)+"") + strings[i]; // �ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ��Ű������ +
         }
         Arrays.sort(answer);
         
         for(int i=0; i<answer.length; i++) {
             answer[i] = answer[i].substring(1);
         }
         return answer;
     }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_25 algo = new algo1_25();
		String[] result = algo.solution(new String[]{"sun","bed","car"}, 1);
		
		if(result[0].equals("car") && result[1].equals("bed") && result[2].equals("sun")) System.out.println("�¾ҽ��ϴ�.");

	}

}
