/*
 * ( ����� ���� )
 * ����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�.
 *  2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
 * */
public class algo1_3 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];
        int sum = 0;
        
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                sum = arr1[i][j] + arr2[i][j];
                answer[i][j] = sum;
            }
        }
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_3 algo = new algo1_3();
		int arr1[][] = {{1,2},{2,3}};
		int arr2[][] = {{3,4},{5,6}};
		int result[][] = algo.solution(arr1,arr2);
		if(result[0][0] == 4 && result[0][1] == 6 && result[1][0] == 7 && result[1][1] == 9) {
			System.out.println("�¾ҽ��ϴ�.");
		}
	}

}
