/*
 * 가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
 * */
public class algo1_29 {
	public String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();
        int num = 0;
        if(s.length() == 1 || s.length() == 2) return s;
        
        if(s.length() % 2 == 0) {
            num = s.length() / 2;
            answer = Character.toString(str[num-1]) + Character.toString(str[num]) ;
        }
        else {
        	num = s.length() / 2;
            answer = Character.toString(str[num]);
        }
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_29 algo = new algo1_29();
		String result = algo.solution("abcde");
		if(result.equals("c")) System.out.println("맞았습니다.");
	}

}
