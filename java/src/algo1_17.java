/*
 * ���� ���� ( ���� ��ȣ ) 
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
 ���� ��� "AB"�� 1��ŭ �и� "BC"�� �ǰ�, 3��ŭ �и� "DE"�� �˴ϴ�. "z"�� 1��ŭ �и� "a"�� �˴ϴ�.
  ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
 * */
public class algo1_17 {
	public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
        	int num = n;	
            int asc = (int) s.charAt(i);  // �ƽ�Ű �ڵ� �� ��ȯ       
            if(asc >64 && asc < 91) { // �빮��  ����
                if(asc + n > 90) {
                    num = num - (90 - asc);
                    asc = 64 + num;
                    
                    answer += Character.toString((char) asc);
                }
                else {
                    asc += num;
                    answer += Character.toString((char) asc);
                }
                 
            }
            else if(asc > 96 && asc < 123) { // �ҹ��� ����
                if(asc + n > 122) {
                	System.out.println("asc: "+asc);
                    num = num - (122 - asc);  
                    System.out.println("n: "+n);
                    asc = 96 + num;
                    System.out.println(asc);
                    answer += Character.toString((char) asc);
                }
                else {
                    asc += num;
                    answer += Character.toString((char) asc);
                }
            }
            else {
                answer += " ";
            }
        }
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_17 algo = new algo1_17();
		String result = algo.solution("AB", 1);
		if(result.equals("BC")) System.out.println("�¾ҽ��ϴ�.");

	}

}
