package ex1;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		long[] arr = solution(a, b);
		
		for(long i : arr){
			System.out.print(i+" ");
		}
	}

	public static long[] solution(int x, int n) {
		
//		long[] answer = new long[n];
//		answer[0] = x;
//		
//		for(int i = 1; i < n; i++) {
//			answer[i] = answer[i-1]+x;
//		}
//		
//		return answer;
		
		long[] answer = new long[n];
		for(int i = 0; i < n; i++) {
			answer[i] = (long)(i+1)*x;
		}
		return answer;
	}
}
