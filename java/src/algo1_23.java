/*
 * 문제 설명 ( 문자열 내림차순으로 정렬하기 )
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
 * */
public class algo1_23 {
	public String solution(String s) {        
		String result = "";
		int[] arr = new int[s.length()];
		char[] cr = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			int ac = (int) s.charAt(i);				
			arr[i] = ac;			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
			cr[i] = (char) arr[i];
			result += Character.toString(cr[i]);
		}
		return result;
    }
	public static void main(String[] args) {// 테스트케이스 확인용 main 코드 
		algo1_23 algo = new algo1_23();
		String result = algo.solution("Zbcdefg");
		if(result.equals("gfedcbZ")) System.out.println("맞았습니다.");

	}

}
