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
		//return Arrays.stream(arr).sum()/(double)arr.length;
		
		double result = 0;
		
		for(int a : arr) {
			result += a;
		}
		return result/arr.length;
    }
}
