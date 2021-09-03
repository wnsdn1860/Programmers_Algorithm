/*
 * ���� ����
S�翡���� �� �μ��� �ʿ��� ��ǰ�� ������ �ֱ� ���� �μ����� ��ǰ�� �����ϴµ� �ʿ��� �ݾ��� �����߽��ϴ�.
 �׷���, ��ü ������ ������ �ֱ� ������ ��� �μ��� ��ǰ�� ������ �� ���� �����ϴ�. 
 �׷��� �ִ��� ���� �μ��� ��ǰ�� ������ �� �� �ֵ��� �Ϸ��� �մϴ�.

��ǰ�� ������ �� ���� �� �μ��� ��û�� �ݾ׸�ŭ�� ��� ������ ��� �մϴ�.
 ���� ��� 1,000���� ��û�� �μ����� ��Ȯ�� 1,000���� �����ؾ� �ϸ�, 1,000������ ���� �ݾ��� ������ �� ���� �����ϴ�.

�μ����� ��û�� �ݾ��� ����ִ� �迭 d�� ���� budget�� �Ű������� �־��� ��, �ִ� �� ���� �μ��� ��ǰ�� ������ �� �ִ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
d�� �μ����� ��û�� �ݾ��� ����ִ� �迭�̸�, ����(��ü �μ��� ����)�� 1 �̻� 100 �����Դϴ�.
d�� �� ���Ҵ� �μ����� ��û�� �ݾ��� ��Ÿ����, �μ��� ��û �ݾ��� 1 �̻� 100,000 ������ �ڿ����Դϴ�.
budget�� ������ ��Ÿ����, 1 �̻� 10,000,000 ������ �ڿ����Դϴ�.
 *
 * ����� ��
d			budget	result
[1,3,2,5,4]	9			3
[2,2,3,3]	10			4
 * */

import java.util.ArrayList;
import java.util.Collections;


public class algo1_32 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<d.length; i++) {
        	list.add(d[i]);
        }
        Collections.sort(list);        
        long budg = budget;
        for(int a : list) {
        	sum += a;        	
        	if(sum > budg) {
        		break;
        	}
        	cnt++;
        }
        answer = cnt;
        return answer;
        
    }
	public static void main(String[] args) {// �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_32 algo = new algo1_32();
		int result = algo.solution(new int[]{1,3,2,5,4}, 9);
		if(result == 3) {
			System.out.println("�¾ҽ��ϴ�.");
		}

	}

}
