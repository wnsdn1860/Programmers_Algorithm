/*
 * ���� ���� ( �ڿ��� ������ �迭�� ����� )
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
 * */
public class algo1_13 {
	public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int cnt = 0;
        for(int i=str.length(); i>0; i--) {       
           int num = str.charAt(i-1) - '0';
            answer[cnt++] = num;
        }
            
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_13 algo = new algo1_13();
		int[] result = algo.solution(12345);
		if(result[0] == 5 && result[1] == 4 && result[2] == 3 && result[3] == 2 && result[4] == 1) System.out.println("�¾ҽ��ϴ�.");
	}

}
