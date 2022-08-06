package ex1;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);

		System.out.println(solution(ip.next()));
		
		ip.close();
	}

	public static String solution(String s) {
		String answer = "";

		int index = s.length(); // 문자열 길이 확인
		if (index % 2 == 0) // 문자열이 홀수인지확인
			// 문자열길이(index)의/2는 절반또는 짝수일경우 배열의 인덱스는 시작부터 0부터 시작하여 셈. 
			// ex) 4개의 인자를 가지는 배열 {1,2,3,4}는 각 인덱스 0,1,2,3번값을 가짐, 이때 배열길이 4를 2로 나눌경우 2가나옴으로서 {3}의 부분을 가리키게됨. 
			answer = s.charAt((index / 2) - 1) + "" + s.charAt(index / 2);	
		else
			answer = s.charAt((index / 2)) + "";

		// #방법2 : substring함수를 이용하여 기존 문자열의 설정된 범위만을 저장할 수 있다. => substring(시작인덱스,끝인덱스) 
		// answer = s.substring((s.length() - 1) / 2, (s.length() / 2 + 1)); 

		return answer;
	}
}
