package ex1;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		long[] arr = solution(a, b);
		
		for(long i : arr) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}

	public static long[] solution(int x, int n) {
				
		long[] answer = new long[n]; // 배열값 개수는 n이므로 
		for(int i = 0; i < n; i++) {
			answer[i] = (long)(i+1)*x; //각 배열에 저장될 값은 반복된 횟수(i+1)의 x배이므로 곱해서 넣기.
		}
		return answer;
	}
}
