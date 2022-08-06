package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,2,3,4};
        
        System.out.println(solution(arr));
         
        
        sc.close();
    }
	public static double solution(int[] arr) {  
		// 자바8의 기능인 스트림을 사용한 답, 실행시간이 매우 길어지므로 참고만 하는것이 좋을 것 같다.
		//return Arrays.stream(arr).sum()/(double)arr.length;
		
		double result = 0;
		
		for(int a : arr) {	//모든 배열 값을 더한뒤 
			result += a;
		}
		return result/arr.length;	//길이만큼 나눈다.
    }
}
