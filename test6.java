package ex1;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public int solution(int[] numbers) {
		int answer = 45;
		
		for (int l : numbers) 
			answer -= l;
		
		return answer;
	}
}
