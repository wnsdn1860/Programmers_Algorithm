/*
 * 문제 설명 ( 문자열 다루기 기본 )
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * */
public class algo1_22 {
	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6)  return false;
        
        try {
			if(s.length() == 4 || s.length() == 6) {
                Integer.parseInt(s);
                return true;
		    }
        }
		catch(NumberFormatException e) {
			return false;
		}
            
        return answer;
    }
	public static void main(String[] args) {// 테스트케이스 확인용 main 코드 
		algo1_22 algo = new algo1_22();
		boolean result = algo.solution("a234");
		if(!result) System.out.println("맞았습니다.");
	}

}
