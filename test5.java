package ex1;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		System.out.println(solution(a));

		sc.close();

	}

	public static int solution(String s) {
		int answer = Integer.parseInt(s);	//간단하게 문자열을 정수값으로 형변환시켜주는 Integer클래스의 메소드 사용.
		return answer;
	}

}
