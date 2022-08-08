package ex1;

import java.util.*;

public class test31 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int prev = 10;				// 값의 범위는 0~9까지이다 10으로 시작하면 시작이 0~9일때 첫 수를 스킵하는 일이 없다.
		
		for(int i : arr) {			// arr를 전부 돌아본다.
			if(prev != i) {			// 이전 수와 같지않다면
				list.add(i);		// list에 추가하고
				prev = i;			// 이전 수를 업데이트한다.
			}
		}
		
		
		return list.stream().mapToInt(i -> i).toArray();	// list를 array로 변환해서 반환.
	}
}
