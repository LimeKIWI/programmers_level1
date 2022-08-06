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
		sc.close();
	}

	public static int[] solution(long n) {
		int[] temp = new int[11];	// 제한조건이 10,000,000,000 이하이므로 최대 11개의 값을 가진 배열이 될 것이다.
		int size = 0;
		while (n > 0) {
			temp[size] = (int)(n%10);	// 숫자를 왼쪽부터 하나씩 받아와 temp배열에 저장한다.
			size++;
			n /= 10;
		}
		int[] answer = new int[size];	// 결과배열의 크기를 반복문에서 세었으므로 그 만큼의 배열을 선언
		System.arraycopy(temp, 0, answer, 0, answer.length);	// 배열을 복사한다 (복사될배열1, 1의시작인덱스, 복사받을배열2, 2의시작인덱스, 어디까지복사받을것인가)
		return answer;
	}
}
