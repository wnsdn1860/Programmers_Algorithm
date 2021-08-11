/*
 * 문제 설명 ( 시저 암호 ) 
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
  문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
 * */
public class algo1_17 {
	public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
        	int num = n;	
            int asc = (int) s.charAt(i);  // 아스키 코드 값 변환       
            if(asc >64 && asc < 91) { // 대문자  범위
                if(asc + n > 90) {
                    num = num - (90 - asc);
                    asc = 64 + num;
                    
                    answer += Character.toString((char) asc);
                }
                else {
                    asc += num;
                    answer += Character.toString((char) asc);
                }
                 
            }
            else if(asc > 96 && asc < 123) { // 소문자 범위
                if(asc + n > 122) {
                	System.out.println("asc: "+asc);
                    num = num - (122 - asc);  
                    System.out.println("n: "+n);
                    asc = 96 + num;
                    System.out.println(asc);
                    answer += Character.toString((char) asc);
                }
                else {
                    asc += num;
                    answer += Character.toString((char) asc);
                }
            }
            else {
                answer += " ";
            }
        }
        return answer;
    }
	public static void main(String[] args) { // 테스트케이스 확인용 main 코드 
		algo1_17 algo = new algo1_17();
		String result = algo.solution("AB", 1);
		if(result.equals("BC")) System.out.println("맞았습니다.");

	}

}
