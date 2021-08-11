/*
 * 문제 설명 ( 수박수박수박수?? )
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
 * */
public class algo1_19 {
	public String solution(int n) {
        String answer = "";
        
        for(int i=1; i<=n; i++) {
        if(i % 2 == 0) answer += "박";
        else answer += "수";
        }
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_19 algo = new algo1_19();
		String result = algo.solution(3);
		if(result.equals("수박수")) System.out.println("맞았습니다.");
	}

}
