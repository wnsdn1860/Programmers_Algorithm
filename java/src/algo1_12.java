/*
 * ���� ����  ( ���� ������������ �����ϱ� )
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
 * */
public class algo1_12 {
	public long solution(long n) {
	      
		String str = String.valueOf(n);
		String result = "";
		long arr[] = new long[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';			
		}
		
		for(int j=0; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				if(arr[j] < arr[k]) {
					long temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			result += arr[i];
		}
		
		long reverse = Long.parseLong(result);
		return reverse;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ�
		algo1_12 algo = new algo1_12();
		long result = algo.solution(118372);
		if(result == 873211) System.out.println("�¾ҽ��ϴ�.");
	}

}
