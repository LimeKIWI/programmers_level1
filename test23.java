package ex1;

import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();

		int[] arr = solution(a);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] solution(long n) {
		int[] temp = new int[11];
		int size = 0;
		while (n > 0) {
			temp[size] = (int)(n%10);
			size++;
			n /= 10;
		}
		int[] answer = new int[size];
		System.arraycopy(temp, 0, answer, 0, answer.length);
		return answer;
	}
}
