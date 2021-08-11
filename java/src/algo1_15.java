/*
 * 문제 설명 ( 이상한 문자 만들기 )
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
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
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_15 algo = new algo1_15();
		String result = algo.solution("try hello world");
		if(result.equals("TrY HeLlO WoRlD")) System.out.println("맞았습니다.");

	}

}
