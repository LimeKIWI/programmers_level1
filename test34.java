package ex1;

import java.util.*;

public class test34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 1, 2, 3, 4, 5 };
		//int[] arr = { 1, 3, 2, 4, 2 };

		arr = solution(arr);
		for(int a : arr)
			System.out.println(a);

	}

	// 작동은하지만 하드코딩을 해서 코드가 너무 보기좋지 않음, 수정필요 (수정후 주석작업진행하겠음).
	// Integer타입으로 비교연산시 -127~128까지의 값은 같은 주소값을 공유하므로 같다면 참의 값을 내보내지만 128이후의 범위는 서로 다른 객체의 같은값을 가진 주소를 비교하므로 다르게 인식함. equals사용권장
	public static int[] solution(int[] answers) {
		int[] player1 = { 1, 2, 3, 4, 5 };
		int[] player2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] player3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("p1", 0);
		map.put("p2", 0);
		map.put("p3", 0);

		// 각 테스트구문만큼 모듈러연산을하면 한개의 반복문으로 생성가능.
		for (int i = 0; i < answers.length;) {
			for (int j = 0; j < player1.length && i < answers.length; j++) {
				if (answers[i] == player1[j])
					map.put("p1", map.getOrDefault("p1", 0) + 1);
				i++;
			}
		}
		for (int i = 0; i < answers.length;) {
			for (int j = 0; j < player2.length && i < answers.length; j++) {
				if (answers[i] == player2[j])
					map.put("p2", map.getOrDefault("p2", 0) + 1);
				i++;
			}
		}
		for (int i = 0; i < answers.length;) {
			for (int j = 0; j < player3.length && i < answers.length; j++) {
				if (answers[i] == player3[j])
					map.put("p3", map.getOrDefault("p3", 0) + 1);
				i++;
			}
		}

		// 반복문을 활용해 구현가능.
		if (map.get("p1").equals(map.get("p2"))) {
			if (map.get("p2") == map.get("p3")) {
				int[] arr = { 1, 2, 3 };
				return arr;
			} else if (map.get("p2") > map.get("p3")) {
				int[] arr = { 1, 2 };
				return arr;
			} else {
				int[] arr = { 1, 3 };
				return arr;
			}
		} else if (map.get("p1") > map.get("p2")) {
			if (map.get("p1").equals(map.get("p3"))) {
				int[] arr = { 1, 3 };
				return arr;
			} else if (map.get("p1") > map.get("p3")) {
				int[] arr = { 1 };
				return arr;
			} else {
				int[] arr = { 3 };
				return arr;
			}			
		} else {
			if (map.get("p2").equals(map.get("p3"))) {
				int[] arr = { 2, 3 };
				return arr;
			} else if (map.get("p2") > map.get("p3")) {
				int[] arr = { 2 };
				return arr;
			} else {
				int[] arr = { 3 };
				return arr;
			}
		}

	}
}
