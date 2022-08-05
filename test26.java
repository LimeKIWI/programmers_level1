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
		if (arr.length == 1) {
			int[] answer = {-1};
			return answer;
		} 
		else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] temp = Arrays.copyOf(arr, arr.length);
			Arrays.sort(temp);
			int min = temp[0];

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > min)
					list.add(arr[i]);
			}
			temp = list.stream().mapToInt(Integer::intValue).toArray();
			return temp;
		}
	}
}
