package ex1;

import java.util.Scanner;

public class test7 {
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
        sc.close();
    }
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
        	
        	answer += (signs[i]) ? absolutes[i] : Integer.parseInt("-"+absolutes[i]);
        }
        
        return answer;
    }
}
