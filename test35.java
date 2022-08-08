package ex1;

import java.util.*;

public class test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"abce", "abcd", "cdx"};
		
		arr = solution(arr, 1);
		
		for(String i : arr) {
			System.out.println(i);
		}
	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		ArrayList<String> list = new ArrayList<String>();
		int[][] idex = new int[strings.length][2];
		
		Arrays.sort(strings);									// 먼저 사전순으로 정렬
		
		for(int i = 0; i < strings.length; i++) {
			idex[i][0] = i;										// 넣을 단어의 인덱스를 바로 찾을 수 있도록
			idex[i][1] = strings[i].charAt(n);					// 단어 정렬을 위한 선택된 글자의 ascii값을 넣는다.
			
		}
		
		Arrays.sort(idex, (o1, o2) -> { return o1[1] - o2[1];});	// idex배열의 2번째 값들로 정렬
		for(int i = 0; i < idex.length; i++) {						
			list.add(strings[idex[i][0]].toString());				// 정렬된 단어들의 인덱스를 바로 참고해서 바로 리스트에 넣는다.
		}
		answer = list.toArray(new String[strings.length]);			// 배열로 변환
		
		return answer;
	}
}
