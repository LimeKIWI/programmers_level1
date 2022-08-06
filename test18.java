package ex1;

import java.util.Arrays;

public class test18 {
	
	public static void main(String[] args) {
       
        String[] seoul = {"Jane", "Kim"};
        
        System.out.println(solution(seoul));
        
    }
	public static String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {	
        	if( seoul[i].equals("Kim")) {		// 반복문을 돌며 Kim을 찾아 찾는다면 답을 저장하고 반복문을 강제종료시킨다.
        		answer = "김서방은 "+i+"에 있다";
        		break;							// 반복문 종료
        	}
        		
        }
        return answer;
        
       // indexOf 함수를 사용하여 해당 값을 가진 인덱스를 바로 받는 방식이다.
//        int x = Arrays.asList(seoul).indexOf("Kim");
//
//        return "김서방은 "+ x + "에 있다";
    }
}
