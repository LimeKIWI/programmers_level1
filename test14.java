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

	}
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {-1};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i]%divisor == 0)
        		list.add(arr[i]);
        }
        
        if(list.isEmpty())
        	return answer;
        
        answer = new int[list.size()];
        
        Collections.sort(list);
        
       
        for(int i = 0; i < list.size(); i++)
        	answer[i] = list.get(i);
       
        
        return answer;
        
 //       return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}
