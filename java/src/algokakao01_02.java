import java.util.ArrayList;


/*
 * 문제 설명
비밀지도
네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
  다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다.
 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
  지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
"지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

네오가 프로도의 비상금을 손에 넣을 수 있도록, 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.

입력 형식
입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.

1 ≦ n ≦ 16
arr1, arr2는 길이 n인 정수 배열로 주어진다.
정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2n - 1을 만족한다.
출력 형식
원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.
9 / 2 1

 * */
public class algokakao01_02 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<arr1.length; i++) {
        	answer[i] = "";
            int cnt1 = 0;
            int cnt2 = 0;
            while(true) {
                int num = arr1[i];                
                list1.add(num % 2);
                System.out.println(num % 2);
                arr1[i] /= 2;
                cnt1++;
                if(cnt1==n) break; // 0값도 채워넣기위해 n까지 반복
            }
            while(true) {
                int num = arr2[i];
                
                list2.add(num % 2);
                
                arr2[i] /= 2;
                cnt2++;
                if(cnt2==n) break;
            }
           
            for(int j=list1.size()-1; j>=0; j--) { // 리스트 역순으로 비교
            	
            	
                if(list1.get(j) == 0 && list2.get(j) == 0) {
                	
                    answer[i] +=" ";
                }
                if(list1.get(j) == 1 || list2.get(j) == 1) {
                	
                    answer[i] +="#";
                }
            }
            list1.clear();
            list2.clear();
        }
       
        return answer;
    }
    
	public static void main(String[] args) {
		algokakao01_02 algo = new algokakao01_02();
		String[] result = algo.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
		System.out.println(result[0]);
	}

}
