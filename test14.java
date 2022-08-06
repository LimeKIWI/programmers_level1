package ex1;

import java.util.*;
import java.util.Arrays;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 9,7,10};
		
		arr = solution(arr, 5);
		
		int[] arr2 = {2, 36,1,3};
		
		arr2 =solution(arr2, 1);
		
		int[] arr3 = {3, 2,6};
		
		arr3 =solution(arr3, 10);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {-1};				// 배열의 기본 값을 -1로 설정
        ArrayList<Integer> list = new ArrayList<Integer>();	// 값을 저장하기 편하도록 ArrayList자료구조를 사용한다. 
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i]%divisor == 0)	// divisor로 나누어 떨어진다면
        		list.add(arr[i]);	// list에 저장을 한다.
        }
        
        if(list.isEmpty())
        	return answer;			// 만약 나누어 떨어지는 값이 없다면 배열의 기본값을 반환한다.
        
        answer = new int[list.size()];	// 리스트만큼의 새 배열을 만들고
        
        Collections.sort(list);		// 리스트를 정렬해서
        
       
        for(int i = 0; i < list.size(); i++)
        	answer[i] = list.get(i);	// 새 배열에 저장을 한다.
       
        
        return answer;
        
 //		자바8버전 이상에서 사용되는 스트림을 이용한 답. 실행시간이 오래 걸리는 단점이 있다.
 //     return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}
