/*
 * ���� ����
2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT

�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� "TUE"�� ��ȯ�ϼ���.

���� ����
2016���� �����Դϴ�.
2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
 * */
public class algo1_30 {
	public String solution(int a, int b) {
        String answer = "";       
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for(int i=0; i<a-1; i++) {
        	sum += month[i];
        }
        sum += b;
        switch(sum % 7) {
        case 0 : answer = "THU"; break;
        case 1 : answer = "FRI";break;
        case 2 : answer = "SAT";break;
        case 3 : answer = "SUN";break;
        case 4 : answer = "MON";break;
        case 5 : answer = "TUE";break;
        case 6 : answer = "WED";break;
        }
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_30 algo = new algo1_30();
		String result = algo.solution(1,1);
		if(result.equals("FRI")) System.out.println("�¾ҽ��ϴ�.");

	}

}
