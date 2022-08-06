package ex1;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(solution(a, b));
		
		sc.close();
	}

	public static long solution(int a, int b) {
		if (a == b) 
			return a;	// 두 값이 같을경우 둘중 리턴시킴 (아래 코드를 탐색하는 시간을 줄이기 위해/ 만약 같지않다면 이 코드가 없을때보다 한줄만큼의 리소스가 더 사용된 것임.)
		
		long answer = 0;
		int temp;
		
		if (a > b) {	// 두 값을 비교해서 정렬함.
			temp = a;
			a = b;
			b = temp;
		}

		for (int i = a; i <= b; i++) {	// 두 값 사이만큼을 반복하여 더함.
			answer += i;
		}
		
		return answer;
	}
}
