package ex1;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
                System.out.print("*");
        	} 
        	System.out.println();
        }
    }
	
	public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++)
        	answer += a[i]*b[i];;
        return answer;
    }
}

