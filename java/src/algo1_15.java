/*
 * ���� ���� ( �̻��� ���� ����� )
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
 �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
 * */
public class algo1_15 {
	public String solution(String s) {
        String answer = "";
        String arr[] = s.split(" ", -1);
        
        for(int i=0; i<arr.length; i++) {
            String str = arr[i];
            for(int j=0; j<str.length(); j++) {
                if(j % 2 == 0) {
                    answer += (str.charAt(j) + "").toUpperCase();
                }
                else {
                    answer += (str.charAt(j) + "").toLowerCase();
                }
            }
            if(i == arr.length - 1) break;
            
            answer += " ";
        }
        return answer;
    }
	public static void main(String[] args) { // �׽�Ʈ���̽� Ȯ�ο� main �ڵ� 
		algo1_15 algo = new algo1_15();
		String result = algo.solution("try hello world");
		if(result.equals("TrY HeLlO WoRlD")) System.out.println("�¾ҽ��ϴ�.");

	}

}
