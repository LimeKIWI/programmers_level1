package ex1;

import java.util.*;

public class test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] solution(int[] numbers) {
	        int[] answer = {};
	        Set<Integer> set = new HashSet<Integer>();		
	        
	        for(int i = 0; i < numbers.length; i++) {			// 기본으로 돌릴 배열반복문 (처음부터 끝까지)
	        	for(int j = i+1; j < numbers.length; j++) {		// 더하는 배열은 (중간부터 끝까지)
	        		set.add(numbers[i]+numbers[j]);				// 더해서 set에 저장한다.(중복저장이 되지 않는 자료구조)
	        	}
	        }
	        
	        
	        answer = set.stream().mapToInt(i -> i).toArray();	// 배열로 다시 변경후
	        Arrays.sort(answer);								// 정렬
	        
	        

		  //set.stream().sorted().mapToInt(Integer::intValue).toArray(); 정렬과 배열변경을 한번에 하는 코드.
	        
	        return answer;
	    }
}
