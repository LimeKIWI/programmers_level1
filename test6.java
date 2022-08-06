package ex1;

public class test6 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 0 };

		System.out.println(solution(arr));

	}

	public static int solution(int[] numbers) {
		int answer = 45;	// 0에서 9를 모두 더한 수로 answer을 초기화

		for (int l : numbers)	// 향상된 for문 사용 numbers 배열을 인덱스 값 없이 간단하게 돌릴 수 있음.
			answer -= l;	// 만약 numbers에 값이 있다면 answer에서 빼준다. (numbers의 값은 중복되지 않기때문에 가능)

		return answer;
	}
}
