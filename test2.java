package ex1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);

		System.out.println(solution(ip.nextInt()));
	}

	public static String solution(int num) {
		String answer = "Odd";		
		if(num%2 == 0)
			answer = "Even";
		return answer;
	}

}
