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
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < participant.length; i++) {
        	if(i == completion.length) {
                answer = participant[i];
                break;
            }
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        
       
        
        return answer;
    }
}
