/*
 * ���� ���� ( ���ڿ� ������������ �����ϱ� )
���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
 * */
public class algo1_23 {
	public String solution(String s) {        
		String result = "";
		int[] arr = new int[s.length()];
		char[] cr = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			int ac = (int) s.charAt(i);				
			arr[i] = ac;			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
			cr[i] = (char) arr[i];
			result += Character.toString(cr[i]);
		}
		return result;
    }
	public static void main(String[] args) {// �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_23 algo = new algo1_23();
		String result = algo.solution("Zbcdefg");
		if(result.equals("gfedcbZ")) System.out.println("�¾ҽ��ϴ�.");

	}

}
