package ex1;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);

		System.out.println(solution(ip.next()));
	}

	public static String solution(String s) {
		String answer = "";

		System.out.println("word length is " + s.length() + " / start index is " + (s.length() - 1) / 2
				+ " / end index is " + (s.length() / 2 + 1));

		int index = s.length();
		if (index % 2 == 0)
			answer = s.charAt((index / 2) - 1) + "" + s.charAt(index / 2);
		else
			answer = s.charAt((index / 2)) + "";

		answer = s.substring((s.length() - 1) / 2, (s.length() / 2 + 1));

		return answer;
	}
}
