package ex1;

import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println();

		sc.close();
	}

	public String solution(String phone_number) {
		String answer = "";
		int numberLength = phone_number.length();
		for (int i = 0; i < numberLength-4; i++) {
			answer += "*";
		}
		
		answer += phone_number.substring(numberLength-4);
		
		
		return answer;
		
		
//		char[] ch = phone_number.toCharArray();
//	     for(int i = 0; i < ch.length - 4; i ++){
//	         ch[i] = '*';
//	     }
//	     return String.valueOf(ch);
		
		
//		return phone_number.replaceAll(".(?=.{4})", "*");
	}
}
