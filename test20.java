package ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1 = {"mislav", "stanko", "mislav", "ana"} ;
		String[] arr2 = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(arr1, arr2));

	}
		
//	이 문제는 HashMap자료구조를 이용해서 값을 찾아 푸는것이 권장됨
//	해당풀이는 시간복잡도 문제를 겨우해결하였으므로 좋은 답안이 되질 않습니다.
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);	//배열 정렬 
        Arrays.sort(completion);	//배열 정렬 
        
        for (int i = 0; i < participant.length; i++) {
        	if(i == completion.length) {		// 정렬된 배열의 마지막값에 완주하지못한사람이 있는 경우
                answer = participant[i];
                break;							// 찾았으므로 조건문 종료
            }
            if(!participant[i].equals(completion[i])) {	// 정렬된 배열을 비교도중 서로 다른사람이 있는경우 한명 부족한 사람이 완주하지 못한 사람이므로
                answer = participant[i];
                break;							// 조건문종료
            }
        }
        
        return answer;
    }
}
