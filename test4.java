package ex1;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(solution(a, b));

	}

	public static long solution(int a, int b) {
		if (a == b) 
			return a;
		
		long answer = 0;
		int temp;
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		for (int i = a; i <= b; i++) {
			answer += i;
		}
		
		return answer;
	}
}
