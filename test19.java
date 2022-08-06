package ex1;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3));
	}

	public static String solution(int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();	// 동기화가 필요없는 반복적인 문자열을 생성하기에 StringBuilder를 사용한다.
		if (n == 0)
			return answer;						// 길이가 0이면 바로반환
		else if (n == 1)
			return "수";							// 길이가 1이면 "수" 반환
		else {
			for (int i = 0; i < n / 2; i++) 	// "수박"이란 2글자 단어가 반복되므로 n만큼의 반복은 필요없다 수박을 한번에 계산하며 n/2만큼의 반복을 하면된다.
				sb.append("수박");				// 반복만큼 sb에 수박을 더한다.
			answer = sb.toString();				// sb를 문자열로 변환한다.

			return n%2 == 0 ? answer : answer+"수";	// 만약 n이 홀수였다면 "수"라는 단어가 하나 더 들어가야하므로 체크해서 리턴시킨다.
		}
	}
}
