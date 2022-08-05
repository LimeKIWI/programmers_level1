package ex1;

import java.util.Scanner;

public class test29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println(solution(a));
		
	}

	public static int solution(int n) {
		int num = n;
		int answer = 0;
		String str;
		StringBuilder sb = new StringBuilder();
		
		while (num != 0)
		{			
			sb.append(num%3);
			num /=3;
		}

		str = sb.toString();
		
//		num = 1;
//		for(int i = str.length()-1; i >= 0; i--) {
//			int t = (str.charAt(i)-'0');
//			answer += t*num ;
//			num *= 3;
//		}
//	
//		
//		return answer;
		
		

		return Integer.parseInt(str, 3);
	}
}
