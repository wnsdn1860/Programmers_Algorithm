/*
 * ���� ���� ( �Ҽ� ã�� )
1���� �Է¹��� ����  n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.

�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
(1�� �Ҽ��� �ƴմϴ�.)

���� ����
n�� 2�̻� 1000000������ �ڿ����Դϴ�.
 * */
public class algo1_20 {
	public int solution(int n) {
        int arr[] = new int[n+1];
        int answer = 0;
        
        for(int i=0; i<=n; i++) {
            arr[i] = i;            
        }        
        arr[1] = 0;        
        
        for(int i=2;i<=n;i++){
            if(arr[i]==0)continue;
            for(int j=i+i;j<=n;j+=i){
                arr[j]=0;
            }
        }


        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                answer++;
            }
        }
        return answer;
    }
	public static void main(String[] args) {// �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_20 algo = new algo1_20();
		int result = algo.solution(10);
		if(result == 4 ) System.out.println("�¾ҽ��ϴ�.");
	}

}
