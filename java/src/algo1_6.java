/*
 * ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����. ( ��� ���ϱ� )
 
���ѻ��� 
arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
 * */
public class algo1_6 {

	public double solution(int[] arr) {
        double answer = 0;
        
        int sum = 0;
        for(int i=0; i< arr.length; i++) {
            sum += arr[i];
        }
        answer = (double) sum / arr.length;
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_6 algo = new algo1_6();
		double result = algo.solution(new int[]{1,2,3,4});
		if(result == 2.5) System.out.println("�¾ҽ��ϴ�.");
	}

}
