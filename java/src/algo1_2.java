/*
 *  ( x��ŭ ������ �ִ� n���� ���� )
 * �Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
 * ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * ���� ����
	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	n�� 1000 ������ �ڿ����Դϴ�.
 * */
public class algo1_2 {
	public long[] solution(long x, int n) { 
		long[] answer = {};
    answer = new long[n];
    long k = x;
    for(int i=0; i<n; i++) {            
        answer[i] = x;
        x = k * ( i+2);
    }
    return answer;
	}

	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ�
		 	algo1_2 algo = new algo1_2();
		 	long result[] = algo.solution(2, 5);
		 	
		 	if(result[0] == 2 && result[1] == 4 &&
		 	result[2] == 6 && result[3] == 8 && result[4] == 10 ) {
		 		System.out.println("�¾ҽ��ϴ�.");
		 	}
		 	
	}

}
