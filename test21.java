package ex1;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		System.out.println(solution(a));
		
		sc.close();
	}

	public static String solution(String s) {
		String answer = "";					// StringBuilder나 StringBuffer를 사용해도 된다. 
		s = s.toLowerCase();				// 문자열을 미리 소문자로 바꿔둔다.
		String[] words = s.split(" ", -1);	// 문자열을 공백문자 단위로 쪼개여 words배열에 저장한다. -1을 인자로넣는다면 뒤쪽 공백 유지가 된다.
		
		for (String word : words) {			// words 배열을 모두 돌아볼 예정이며 인덱스가 필요없으므로 향상된 for문을 사용한다.
			for (int i = 0; i < word.length(); i++) {	// 각 단어의 글자를 돌아봐야하므로 단어의 길이만큼 반복한다.
				if(i%2 != 0) 							// 단어의 홀수번 문자일경우
					answer += (""+word.charAt(i));		// 그대로 추가
				else									// 짝수번 문자일경우
					answer += (""+word.charAt(i)).toUpperCase();	// 대문자로 변환해 추가한다.
			}
			answer += " ";	// 공백을 만들어준다.
		}
				
		;
		return answer.substring(0, answer.length() - 1); // 반복문에서 나올때 마지막에 공백 추가한 것은 제거해야하므로 substring을 사용했다.
	}
	
	// 문자를 char형 배열로 바꾸어 해결한 방식이다.
//	public String solution(String s) {
//        char[] chars = s.toCharArray();
//        int idx = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == ' ')
//                idx = 0;
//            else
//                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
//        }
//
//        return String.valueOf(chars);
//  }

}
