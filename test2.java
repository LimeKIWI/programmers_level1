package ex1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);

		System.out.println(solution(ip.nextInt()));
		
		ip.close();
	}

	public static String solution(int num) {
		String answer = "Odd";		// 답변의 기본을 Odd로 설정
		if(num%2 == 0)				// 입력받은 값을 나머지연산을 시켰을때 나머지가 없다면 짝수가 된다.
			answer = "Even";		// 답변을 Even으로 변경
		return answer;
	}

}
