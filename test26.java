package ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class test26 {
	public static void main(String[] args) {
		int[] arr = {};

		arr = solution(arr);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

	public static int[] solution(int[] arr) {	
		if (arr.length == 1) { 	 // 먼저 배열에 값이 하나있다면 -1 리턴이므로 체크
			int[] answer = {-1};
			return answer;
		} 
		else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] temp = Arrays.copyOf(arr, arr.length);	// 배열의 최솟갑을 바로 찾기위해 정렬을 할 복사본배열을 만들어준다.
			Arrays.sort(temp);								// 복사배열 정렬
			int min = temp[0];								// 정렬된 배열의 첫 값은 최솟값이다.

			for (int i = 0; i < arr.length; i++) {			// 기존 배열을 탐색한다.
				if (arr[i] > min)							// 최솟값보다 큰 값은 리스트에 저장한다.
					list.add(arr[i]);
			}
			temp = list.stream().mapToInt(Integer::intValue).toArray();		// 스트림함수를 이용해서 list를 배열로 변환한다.
			return temp;
		}
	}
}
