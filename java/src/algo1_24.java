/*
 * ���ڿ� �� p�� y�� ����
���� ����
�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�.
 s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���.
 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
 * */
public class algo1_24 {
	boolean solution(String s) {
        
        int pcnt = 0;
        int ycnt = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') pcnt++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') ycnt++;
        }
        if(pcnt == 0 && ycnt == 0) return true;
        if(pcnt == ycnt) {
            return true;
        } else {
            return false;
        }
        
    }
	public static void main(String[] args) {// �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_24 algo = new algo1_24();
		boolean result = algo.solution("pPoooyY");
		if(result) System.out.println("�¾ҽ��ϴ�.");
		

	}

}
